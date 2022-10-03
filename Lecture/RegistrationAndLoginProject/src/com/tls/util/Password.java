package com.tls.util;

public class Password extends Person{
	
	private String password;
	
	public Password(String password) {
		this.password = password;
	}
	
	@Override
	public String getPassword() {
		return password;
	}

}
