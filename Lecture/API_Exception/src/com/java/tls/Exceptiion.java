package com.java.tls;

public class Exceptiion {
	
	public static void main(String [] args) {
		method3();
	}
	
	public static void method3() {
		method2();
	}
	
	public static void method2() {
		method1();
	}
	
	public static void method1() {
		calculate();
	}
	
	public static void calculate() throws ArithmeticException{
	/*	try {
			System.out.println(2/0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	*/	
		System.out.println(2/0);
		System.out.println("Print Me .....");
	}

}
