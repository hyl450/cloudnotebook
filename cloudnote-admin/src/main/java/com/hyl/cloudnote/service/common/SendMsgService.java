package com.hyl.cloudnote.service.common;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * @author : huangyl
 * @vesion : v1.0
 * @date : 2023/2/16 14:17
 * @description : 消息发送
 */
@RequiredArgsConstructor
@Service
public class SendMsgService {
	private static final Logger log = LoggerFactory.getLogger(SendMsgService.class);

	private final RabbitTemplate rabbitTemplate;
	private final Queue myQueue;
	public void sendMsg(String msg) {
		log.info("消息主题:{},消息内容:{}", myQueue.getName(), msg);
		rabbitTemplate.convertAndSend(myQueue.getName(), msg);
	}
}
