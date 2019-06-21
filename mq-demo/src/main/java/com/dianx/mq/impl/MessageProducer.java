package com.dianx.mq.impl;

import com.dianx.mq.config.MqConfiguration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendSms(String msg) {
		log.info("生产消息["+msg+"]到队列:"+MqConfiguration.QUEUE_NAME_DEMO);
		rabbitTemplate.convertAndSend(MqConfiguration.QUEUE_NAME_DEMO, msg);
		rabbitTemplate.getExchange();
	}

}
