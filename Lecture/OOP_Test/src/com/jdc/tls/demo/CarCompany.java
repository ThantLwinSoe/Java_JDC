package com.jdc.tls.demo;

public class CarCompany {
	public CarFactory getProduct(String carName) {
		
		return switch(carName) {
		case "A" -> new CarA();
		case "B" -> new CarB();
		default -> null;
		};
	}
}
