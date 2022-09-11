package com.tls.demo;

public class AdsFactoryWork extends AbstractFactory {

	@Override
	Painting getPainting(String work) {
		return new PaingFactroy().getPaint(work);
	}

	@Override
	Shape getShape(String shape) {
		return new ShapeFactory().getShape(shape);
	}

	
}
