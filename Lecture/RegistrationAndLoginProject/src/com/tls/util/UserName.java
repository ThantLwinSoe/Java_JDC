package com.tls.util;

public class UserName extends Person{
	
	private String username;
	
	public UserName(String name) {
		this.username = username;
	}
	
	@Override
	public String getUserName() {
		return this.username;
	}

}
