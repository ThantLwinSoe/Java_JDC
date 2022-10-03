package com.tls.util;

public class MyException extends RuntimeException {
//	private static final long serialVersionUID = 1L;
	
	private static final long serialVersionUID = 1L;
	private String meassage;
	
	public MyException(String message) {
		super(message);
	}
	
	public String getMessgae() {
		return this.meassage;
	}
}
