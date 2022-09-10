package com.jdc.tls.demo;

public class BikeB implements BikeFactory {

	@Override
	public String getModel() {
		return "Bike-Model-2";
	}

	@Override
	public String getNumber() {
		return "B002";
	}

}
