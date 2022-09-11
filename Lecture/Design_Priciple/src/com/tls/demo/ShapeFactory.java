package com.tls.demo;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		
		return null;
	}

}
