package com.hyl.cloudnote.config;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/16 20:00
 * @description :
 */
@Aspect
@Configuration
public class LogAop {

	private static final Logger logger = LoggerFactory.getLogger(LogAop.class);

	@Pointcut(value = "execution(public * com.hyl.cloudnote.controller..*(..))")
	public void execute(){
	}

	@Around("execute()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)requestAttributes;
		HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();

		String uri = httpServletRequest.getRequestURI();
		String method = httpServletRequest.getMethod();
		String queryString = httpServletRequest.getQueryString();
		Object[] args = pjp.getArgs();
		String params = "";
		if(args.length > 0){
			if("POST".equals(method) ){
				for(Object o:args){
					if(null!=o){
						Map map = getKeyAndValue(o);
						if(!map.isEmpty()){
							params += JSONObject.toJSONString(map);
						}
					}
				}

			}else if("GET".equals(method)){
				params = queryString;
			}
		}

		long beginTime = System.currentTimeMillis();
		logger.info("请求URI:{},方法:{},参数:{}",uri,method,params);

		Object result = pjp.proceed();

		logger.info("请求结束，返回参数:{}",JSONObject.toJSONString(result));
		long endTime = System.currentTimeMillis();
		long time = endTime - beginTime;
		logger.info("执行时长：{}mm",time);
		return result;
	}

	public static Map<String,Object> getKeyAndValue(Object object){
		Map<String,Object> map = new HashMap<String, Object>();
		Class uCla = (Class)object.getClass();

		if(!(uCla.getPackage().getName().startsWith("com.ahunicom")
				|| uCla.getPackage().getName().startsWith("java.") )){
			return map;
		}

		Field[] fs = uCla.getDeclaredFields();
		for(int i=0;i<fs.length;i++){
			Field f = fs[i];
			f.setAccessible(true);
			Object val = new Object();
			try {
				val = f.get(object);
				map.put(f.getName(),val);
			}catch (Exception e){
				logger.error(e.getMessage(),e);
			}
		}
		return map;
	}

}
