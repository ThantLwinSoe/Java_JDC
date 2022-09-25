package com.tls;

public class ContainerTest {
	
	public static void main(String[] args) {
		
		Container<String> c1 = new Container<>("Thant Lwin Soe");
		System.out.println(c1.getName());
		
		Container<Person> c2 = new Container<>(new Person("Khin Wint War"));
		System.out.println(c2.getName().getName());
	}
	
	
}
