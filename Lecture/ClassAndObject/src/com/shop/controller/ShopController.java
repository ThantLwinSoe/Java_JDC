package com.shop.controller;
import com.shop.ddo.Item;

public class ShopController {
	
	// Item Information
	static Item [] item = { new Item("Apple", 1000, 50), 
									   new Item("Orange", 500, 100),
									   new Item("Mango", 400, 30)};
	
	public void start() {
		
		showMenu();
	}
	
	public void showMenu() {
		
		for (int i =0 ; i < item.length; i ++) {
			
			System.out.println((i+1) + ": "+ item[i].getName() +" -> " + item[i].getPrice() +" kyats ["+ item[i].getQuantity()+"]");
		}
	}
		
}
	

