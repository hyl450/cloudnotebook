package com.hyl.cloudnote.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/16 14:14
 * @description :
 */
@Configuration
public class RabbitConfig {

	@Bean
	public Queue myQueue(){
		return new Queue("del_surplus_image_files", true);
	}
}
