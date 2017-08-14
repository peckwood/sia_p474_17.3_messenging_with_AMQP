package amqp.alerts;

import amqp.domain.User;

public class UserAlertHandler {
	public void handleUserAlert(User user){
		System.out.println(user);
	}
}
