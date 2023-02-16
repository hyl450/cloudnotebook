package com.hyl.cloudnote.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class FileHandleConfig  extends WebMvcConfigurationSupport {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		//System.getProperty("user.dir") 获取到当前jar的所在路径
		String property = "File:" + System.getProperty("user.dir") + "/static/image/upload/ueditor/";
		//所以当需要访问上传的图片时，url路径为：http://你的服务器IP:8080/images/book/1.jpg
		registry.addResourceHandler("/image/upload/ueditor/**").addResourceLocations(property);
		registry.addResourceHandler("/**").
				addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
		super.addResourceHandlers(registry);

	}

}
