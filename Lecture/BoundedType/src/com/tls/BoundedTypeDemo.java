package com.tls;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeDemo {
	public static void main(String ... args) {
		List<A> alist = new ArrayList<>();
		List<B> blist = new ArrayList<>();
		List<C> clist = new ArrayList<>();
		List<Person> plist = new ArrayList<>();
		List<Student> slist = new ArrayList<>();
		
		
	}
	
	public static void print(List<?> list) { // ? can call anything

	}	
	public static void lowerBoundType(List<? super B> list) { // B and his parent only invote
	
	}
	
	public static void upperBoundType(List<? extends B> list) { // A and his subClass only invote
		
	}
}

class Person {}
class Student extends Person{}

class A {
	
}
class B extends A {
	
}
class C extends B {
	
}
