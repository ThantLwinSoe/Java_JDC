package com.myshop;
import java.util.*;

public class MyShop {
	
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		
//		System.out.println(calculator());
		
		int volcher =0 ;
		int  buyAgain;
		
		
		do {
			showInfo();
			
			System.out.print("Please Choose: 1 or 2 =====> :   ");
			int number = sc.nextInt();
			
			System.out.print("Enter amount: ");
			int amount = sc.nextInt();
			
			volcher += calculator(number, amount);
			
			System.out.println("Do you want to buy other devices???");
			System.out.print("Please type 1:      ");
			
			buyAgain = sc.nextInt();
			
			
		} while(buyAgain == 1);
		
				
		System.out.println(volcher);
		
	}
	
	public static void showInfo() {
			
		System.out.println("What do you wanna to buy?");
		System.out.println("1: Phone 100$");
		System.out.println("2: laptop 500$");
		
		
	}
	
	public static int calculator(int number, int amount) {
		
		int price = 0;
		 
		if (number == 1 || number == 2) {
			
			if (number == 1) {
				price = 100 * amount;
			} else {
				price = 500 * amount;
			}
			
		}else {
			
			System.out.println("Sorry, We have two Option Phone or Laptop.Please enter valid number!!!");
		}
		
		
		
		return price;
	}

}


 
