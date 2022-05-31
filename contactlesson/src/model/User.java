package model;

import java.io.Serializable;

public class User implements Serializable {
	private String name,email,message;
	public User() {}
	public User(String name,String email,String message){
		this.name=name;
		this.email=email;
		this.message=message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
