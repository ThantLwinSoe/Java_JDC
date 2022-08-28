package com.shop.controller;
import com.shop.ddo.Item;
import java.util.Scanner;

public class ShopController {
	
	Scanner sc = new Scanner(System.in);
	
	// Item Information
	Item [] item = { new Item("Apple", 1000, 50), 
									   new Item("Orange", 500, 100),
									   new Item("Mango", 400, 30)};
	
	public void start() {
		
		showMenu();
	}
	
	public void showMenu() {
		
		for (int i =0 ; i < item.length; i ++) {
			
			System.out.println((i+1) + ": "+ item[i].getName() +" -> " + item[i].getPrice() +" kyats ["+ item[i].getQuantity()+"]");
		}
	}
	
	public int price(String number) {
		
	    int temp = 0;
		int totalprice = 0;
		
		if(number.equals("1")) {
			
			int index = Integer.parseInt(number);
			
			System.out.println("Yeah, " + item[index -1].getName() + " is: " + item[index -1].getPrice() + " kyats");
			System.out.println("How many do you buy?");
			System.out.println("We have some: " + item[index-1].getQuantity());
			
			System.out.print("Enter quantity: ");	
			String quaStr = sc.nextLine();
			int quantity = Integer.parseInt(quaStr);
			
			if(quantity <= item[index - 1].getQuantity() ) {
				
				temp = item[index-1].getQuantity() - quantity ;
				
				item[index -1 ].setQuantity(temp);
				
				totalprice = item[index - 1].getPrice() * quantity;
				
				System.out.println(totalprice);
				
			} else {
				System.out.println("Sorry we have: " + item[index-1].getQuantity());
			}
			
			
		} else if (number.equals("2")) {
			
			int index = Integer.parseInt(number);
			
			System.out.println("Yeah," +item[index -1].getName()+ " is: " + item[index -1].getPrice() + " kyats");
			System.out.println("How many do you buy?");
			System.out.println("We have some: " + item[index-1].getQuantity());
			
			System.out.print("Enter quantity: ");	
			String quaStr = sc.nextLine();
			int quantity = Integer.parseInt(quaStr);
			
			if(quantity <= item[index - 1].getQuantity() ) {
				
				temp = item[index-1].getQuantity() - quantity ;
				
				item[index -1 ].setQuantity(temp);
				
				totalprice = item[index - 1].getPrice() * quantity;
				
				System.out.println(totalprice);
				
			} else {
				System.out.println("Sorry we have: " + item[index-1].getQuantity());
			}
			
			
			
		}else if (number.equals("3")) {
			
			int index = Integer.parseInt(number);
			
			System.out.println("Yeah," +item[index -1].getName()+ " is: " + item[index -1].getPrice() + " kyats");
			System.out.println("How many do you buy?");
			System.out.println("We have some: " + item[index-1].getQuantity());
			
			System.out.print("Enter quantity: ");	
			String quaStr = sc.nextLine();
			int quantity = Integer.parseInt(quaStr);
			
			if(quantity <= item[index - 1].getQuantity() ) {
				
				temp = item[index-1].getQuantity() - quantity ;
				
				item[index -1 ].setQuantity(temp);
				
				totalprice = item[index - 1].getPrice() * quantity;
				
				System.out.println(totalprice);
				
			} else {
				System.out.println("Sorry we have: " + item[index-1].getQuantity());
			}
			
		} else {
			System.out.println("Thanks you : we have " + item.length+ "Enter choose number");
		}
		
		return totalprice;
	}

	public void payMent(String cash, int totalAmount) {
		
		int claim = 0;
		
		int payCustomer = Integer.parseInt(cash);
		
		if(payCustomer >= totalAmount) {
			
			claim = payCustomer - totalAmount;
			
			showFrame(payCustomer, totalAmount, claim);
			
		} else {
			claim = totalAmount - payCustomer;
			System.out.println("Sorry Sir, You have to pay more: " + claim);
		}
		
	}

	public void showFrame(int customerpay, int totalAmount, int claim) {
		
		String head = """ 
					****************************
					\tR E C I P T
					****************************""";
		String show1 = "Total Amount         " + totalAmount;
		String show2 = "Customer Payment     " + customerpay;
		String line = "****************************";
		String show3 = "customer Cash        "+ claim;
		String foot = """ 
				      ****************************
				              T H A N K S
		         
		        ****************************""";
		
		System.out.println();
		
		System.out.println(head+"\n" +show1+"\n"  + show2+"\n" + line+"\n" +show3+"\n" +foot);
		
		
	}
		
}
	

