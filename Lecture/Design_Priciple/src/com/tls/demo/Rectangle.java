package com.tls.demo;

public class Rectangle implements Shape {

	@Override
	public String draw() {
		return "I draw rectangle";
	}

	@Override
	public String color() {
		return "Black";
	}

}
