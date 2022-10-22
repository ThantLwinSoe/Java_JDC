package com.tls;

public class Item {
	
	private String name;
	private int age;
	
	public Item(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String showName(int age , String name) {
		return name + age;
	}
	
	public int showAge(int age , String name) {
		return age;
	}
	
	public Item showItem(int age, String name) {
		return new Item(name, age);
	}

}
