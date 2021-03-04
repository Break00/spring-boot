package com.jason.lee;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringbootExampleApplicationTests {

	@Autowired
	RabbitTemplate template;

	@Autowired
	AmqpAdmin amqpAdmin;

	@Test
	public void createExchange(){
		// 交换器
		amqpAdmin.declareExchange(new DirectExchange("exchange.new"));
		// 队列
		amqpAdmin.declareQueue(new Queue("iflytek.new", true));
		// 绑定
		amqpAdmin.declareBinding(new Binding("iflytek.new", Binding.DestinationType.QUEUE,"exchange.new","iflytek.new",null));
	}

	@Test
	public void sendMessage(){
		template.convertAndSend("exchange.direct","xmu.news","ha ha");
	}

	@Test
	public void receiveMessage(){
		Object msg = template.receiveAndConvert("xmu.news");
		System.out.println(msg);
	}
}
