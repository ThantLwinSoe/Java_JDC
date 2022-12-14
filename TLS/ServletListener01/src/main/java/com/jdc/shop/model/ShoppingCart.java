package com.jdc.shop.model;

import java.io.Serializable;

public interface ShoppingCart extends Serializable {
	
	void add(Product p);
	
	int itemCount();
	
	void clear();
	
	int total(); 
	
	public static ShoppingCart generate() {
		
		return null;
	}

}
