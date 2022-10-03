package com.tls.util;

public class Email extends Person{
	
	private String email;
	
	public Email(String email) {
		this.email = email;
	}
	
	@Override
	public String getEmail() {
		return email;
	}

}
