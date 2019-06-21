# springboot-rabbitmq-demo
springboot集成rabbitmq

1、生产消息代码：


	@Autowired
	private RabbitTemplate rabbitTemplate;
	public void sendSms(String msg) {
		log.info("生产消息["+msg+"]到队列:"+MqConfiguration.QUEUE_NAME_DEMO);
		rabbitTemplate.convertAndSend(MqConfiguration.QUEUE_NAME_DEMO, msg);
		rabbitTemplate.getExchange();
	}


---------------------------------------------------
2、接收消息代码

	@RabbitHandler
	public void process(String msg) {
		log.info(MqConfiguration.QUEUE_NAME_DEMO+"队列消费者消费消息："+msg);
	}
  
  



