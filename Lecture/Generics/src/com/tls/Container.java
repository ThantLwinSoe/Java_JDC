package com.tls;

public class Container <Type> {
	
	private Type name;
	Container(Type name) {
		this.name = name;
	}
	
	Type getName() {
		
		return this.name;
	}																				
}
