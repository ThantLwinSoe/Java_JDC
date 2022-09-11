package com.tls.liskov_substitution;

public class Rectangle {
	
		double width;
		double height;
		
		void setHeight(double height) {
			this.height = height;
		}
		double getHeight() {
			return height;
		}
		void setWidth(double width) {
			this.width = width;
		}
		double getWidth() {
			return width;
		}
		double getArea() {
			return width*height;
		}
		
}
