package com.tls.demo;

public abstract class AbstractFactory {
	abstract Painting getPainting(String work);
	abstract Shape getShape(String work);
}
