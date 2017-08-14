package amqp.producer;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import amqp.domain.User;

public class Producer {
	public static void main(String[] args) throws InterruptedException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("amqp-producer.xml");
		AmqpTemplate template = (AmqpTemplate) context.getBean(RabbitTemplate.class);
		for(int i=0;i<20;i++){
			System.out.println("Sending message #"+i);
			User user = new User((long)i, "name", new Date());
			template.convertAndSend(user);
			Thread.sleep(5000);
		}
		System.out.println("Done!");
	}
}
