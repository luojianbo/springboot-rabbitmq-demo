package com.dianx.mq.impl;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.dianx.mq.config.MqConfiguration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RabbitListener(queues = MqConfiguration.QUEUE_NAME_DEMO)
public class MessageReceiver {
	
	@RabbitHandler
	public void process(String msg) {
		log.info(MqConfiguration.QUEUE_NAME_DEMO+"队列消费者消费消息："+msg);
	}

}
