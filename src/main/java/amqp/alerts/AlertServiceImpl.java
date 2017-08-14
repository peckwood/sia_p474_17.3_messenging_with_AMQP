package amqp.alerts;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import amqp.domain.User;

public class AlertServiceImpl implements AlertService{

	@Autowired
	private RabbitTemplate rabbit;
	
	@Override
	public void sendUesrAlert(User user) {
		rabbit.convertAndSend("user.alert.exchange", "user.alerts", user);
	}

}
