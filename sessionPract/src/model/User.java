package model;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String address;
	private String comment;

	public User() {}
	public User(String name,String address,String comment) {
		this.name=name;
		this.address=address;
		this.comment=comment;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getComment() {
		return comment;
	}

	public boolean execute(User user) {
		return true;
	}

}
