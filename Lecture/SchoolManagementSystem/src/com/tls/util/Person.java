package com.tls.util;

public class Person {
	
	private String name;
	private String address;
	private String phone;
	private String profession;
	
	private String[][] infoArray;
	
	public Person() {		
		this.infoArray = new String [][] {};	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}

}
