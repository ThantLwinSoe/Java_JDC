package com.jdc.tls.demo;

public class CarB implements CarFactory {

	@Override
	public String getEngine() {
		return "Car-Eng2";
	}

	@Override
	public String getWheels() {
		return "Car-2-wheels";
	}

}
