package com.test;

public class GetterAndSetter {
	
	private String name ;
	private int age;
	private String address;
	private String phone;
	
	public GetterAndSetter(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public GetterAndSetter() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age > 0) {
			
			this.age = age;
		} else {
			System.out.println("There is no 0 age, please type correct age:");
		}
		
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	

}
