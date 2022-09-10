package com.jdc.tls.demo;

public class Main {

	public static void main(String[] args) {
		
		MyCompany myCom = new MyCompany();
		// Set the Car 
		myCom.setCarFactory(new CarA());
		// get the stages and behavior of Car Object 
		System.out.println(myCom.getCarFactory().getEngine() + "\t " + myCom.getCarFactory().getWheels() );
		
		myCom.setBikeFactory(new BikeA());
		
		System.out.println(myCom.getBikeFactory().getModel() + "\t " + myCom.getBikeFactory().getNumber());
		
	}

}

