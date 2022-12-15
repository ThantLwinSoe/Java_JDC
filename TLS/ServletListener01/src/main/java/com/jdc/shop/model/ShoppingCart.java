package com.jdc.shop.model;

import java.io.Serializable;

import com.jdc.shop.model.entity.Product;

public interface ShoppingCart extends Serializable {
	
	void add(Product p);
	
	int itemCount();
	
	void clear();
	
	int total(); 
	
	public static ShoppingCart generate() {
		
		return null;
	}

}
