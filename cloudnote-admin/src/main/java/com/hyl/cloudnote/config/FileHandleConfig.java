package com.hyl.cloudnote.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * @description : 拦截器配置
 * @param : 
 * @return : 
 * @author : huangyl
 * @time : 2023/2/18
 */
@Configuration
public class FileHandleConfig  extends WebMvcConfigurationSupport {

	@Value("${ueditor.image.filePath}")
	private String filePath;

	private static final Logger logger = LoggerFactory.getLogger(FileHandleConfig.class);

	/**
	 * @description : 访问静态文件
	 * @param : [registry]
	 * @return : void
	 * @author : huangyl
	 * @time : 2023/2/18
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		logger.info("获取到当前jar的所在路径:{}", System.getProperty("user.dir"));
		logger.info("获取到ueditor.filePath所在路径:{}", filePath);
		//System.getProperty("user.dir") 获取到当前jar的所在路径
//		String filePath = "File:" + System.getProperty("user.dir") + "/static/image/upload/ueditor/";
		//所以当需要访问上传的图片时，url路径为：http://你的服务器IP:8080/images/book/1.jpg
		registry.addResourceHandler("/image/upload/ueditor/**/**").addResourceLocations("File:" + filePath);
		registry.addResourceHandler("/**").
				addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
		super.addResourceHandlers(registry);

	}

}
