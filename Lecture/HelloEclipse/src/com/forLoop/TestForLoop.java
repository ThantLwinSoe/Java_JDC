package com.forLoop;

import java.util.Scanner;

public class TestForLoop {

	static Scanner sc;
	
	public static void main(String[] args) {
		
//		System.out.print("Please Enter the number: ");
		
//		okLoop();
		
		downTriangle();
	}
	
	public static void okLoop( ) {
		
		int number = 10;
		for ( int i = 0 ; i < 10 ; i ++) {
			
				System.out.println(number - i);
				
		}
		
		
	}
	
	public static void downTriangle() {
		
		for(int i = 0; i < 5 ; i ++) {
			
			for (int j = 0; j < 5 ; j ++) {
				
				if(j == i || j > i) {
					System.out.print("*");
				} 
				
				System.out.print(" ");
				
			}
		System.out.println("");
			
		}
	}
	
	

}
