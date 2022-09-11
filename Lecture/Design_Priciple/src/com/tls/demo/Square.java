package com.tls.demo;

public class Square implements Shape {

	@Override
	public String draw() {
		return "I draw square";
	}

	@Override
	public String color() {
		return "green";
	}

}
