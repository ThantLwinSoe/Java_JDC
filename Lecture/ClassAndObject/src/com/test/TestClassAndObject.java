package com.test;

public class TestClassAndObject {

	public static void main(String[] args) {
		
		var testGNS = new GetterAndSetter();		
		
		testGNS.setAge(0);
		
		
		
		var testTwo = new GetterAndSetter("Tun Tun", 20);
		
		System.out.println("Hello I'm " +testTwo.getName() + ". I'm " +	testTwo.getAge() + " years old.");
		
	}

}
