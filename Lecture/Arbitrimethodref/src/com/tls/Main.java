package com.tls;

public class Main {
	public static void main(String[] args) {
		
		MyInterface inf = (a,b,c) -> a.showInfo();
		inf.getInterface(new Person(), "Thant" ,20);
	}
}
