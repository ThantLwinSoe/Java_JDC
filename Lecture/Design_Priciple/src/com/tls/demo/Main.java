package com.tls.demo;

public class Main {

	public static void main(String[] args) {
		
/*		ShapeFactory factory = new ShapeFactory();
		
		Shape shape = factory.getShape("square");
		
		System.out.println(shape.draw() + " ==> " + shape.color());
		
		*/
		
		AdsFactoryWork ads = new AdsFactoryWork();
		
		ads.getPainting("house").paid();
		
		//Shape sg = ads.getShape("Circle");
		
		//System.out.println(sg.color() + "==>" +sg.draw());
		
		System.out.println(ads.getShape("Circle").color() + "==>" +ads.getShape("Circle").draw());
	}

}
