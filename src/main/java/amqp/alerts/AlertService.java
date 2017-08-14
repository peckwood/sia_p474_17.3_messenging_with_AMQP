package amqp.alerts;

import amqp.domain.User;

public interface AlertService {
	void sendUesrAlert(User user);
}
