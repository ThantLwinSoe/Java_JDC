package com.tls.demo;

public class Circle implements Shape {

	@Override
	public String draw() {
		return "I draw Circle";
	}

	@Override
	public String color() {
		return "Red";
	}

}
