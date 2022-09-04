package com.jdk.tls.demo1.model;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	String checkGender() {
		
		if( gender.equalsIgnoreCase("male")){
			return "Mr."+name;
		} else if(gender.equalsIgnoreCase("female")) {
			return "Miss."+name;
		} else {
			return "Please enter valid name ";
		}
	}
	
	int checkAge() {
		return age>0 ? age : 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	String getGender() {
		return gender;
	}
	
	
	String getName() {
		return checkGender();
	}
	
	int getAge() {
		return checkAge();
	}
	
	public void showName() {
		
		System.out.printf("Hello, %s , Age is %d ,Gender is %s", getName(),getAge(),getGender());
		
	}

}
