package amqp.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String username;
	private Date birthday;
	
	public User() {
	}

	public User(Long id, String username, Date birthday) {
		this.id = id;
		this.username = username;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
