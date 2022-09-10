package com.jdc.tls.demo;

public class CarA implements CarFactory {

	@Override
	public String getEngine() {
		return "Car-Eng1";
	}

	@Override
	public String getWheels() {
		return "Car-4-wheels";
	}
	
}
