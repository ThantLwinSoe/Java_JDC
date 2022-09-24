package com.tls;

public class Demo {
	
	public static void main(String[] args) {
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30);
		
		System.out.printf("%-7s %-15s %-5s %10s \n","ID","Name","Age","Salary");
		System.out.printf("%-7d %-15s %-5d %10s \n",10,"KL",20,1500);
		System.out.printf("%-7d %-15s %-5d %10s \n",10,"Hla",20,4500);
		System.out.printf("%-7d %-15s %-5d %10s \n",10,"TLS",20,7500);
	}
	
	public static void sum(int... num) {
		
	}

}
