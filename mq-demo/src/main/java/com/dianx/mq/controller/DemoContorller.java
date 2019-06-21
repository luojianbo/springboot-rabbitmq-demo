package com.dianx.mq.controller;

import com.dianx.mq.impl.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoContorller {

	@Autowired
	private MessageProducer messageProducer;

	@GetMapping("send/{msg}")
	public void sendMsg(@PathVariable("msg") String msg) {
		messageProducer.sendSms(msg); 
	}

}
