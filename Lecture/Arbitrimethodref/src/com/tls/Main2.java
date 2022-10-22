package com.tls;

public class Main2 {
	
	public static void main(String[] args) {
		//ItemInterface<Person, Integer, String> test = Item::showName;
		ItemInterface<Person,Integer,String>test = Item::showName;
		String name = test.show(new Item("Apple", 400),400 , "Apple");
	}

}
