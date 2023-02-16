package com.hyl.cloudnote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2022/12/16 14:49
 * @description : 微服务启动类
 */
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
@SpringBootApplication(scanBasePackages = "com.hyl.cloudnote")
@MapperScan("com.hyl.cloudnote.mapper")
@EnableScheduling//这个注解的作用就是开启定时任务功能 利用springtask即时spring的自己的技术
@EnableRabbit
public class CloudnoteApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudnoteApplication.class, args);
	}
}
