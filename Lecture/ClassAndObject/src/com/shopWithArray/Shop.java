package com.shopWithArray;
import com.shop.controller.ShopController;
import java.util.Scanner;

public class Shop {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		var test = new ShopController();
		int totalAmount = 0;
		String sensor = "";
		String number = "";
		String cash ="";
		int customerpay = 0;
		
		do {
			
			test.start();
			
			System.out.println("Please choose 1 2 3 ");
			number = sc.nextLine();
			
			totalAmount = test.price(number);
			
			System.out.println("How about other fruits? If you Enter 'y'");
			String askAgain = sc.nextLine();
			
			if(askAgain.equals("y")) {
				System.out.println("Please choose 1 2 3 ");
				number = sc.nextLine();
				totalAmount += test.price(number);
				System.out.println("Wooo, Your Total Price is: " + totalAmount);
				
			} else {
				System.out.println(totalAmount);
				System.out.println("Thanks you!!!");
			} 
			
//			test.start();
			
			System.out.println("By the way, We have get Some!!!Do you want to buy more? If you Enter 'y'");
			test.start();
			
			sensor = sc.nextLine();
			
			
			
		} while (sensor.equals("y"));
		
		System.out.println("Total Amount is: " + totalAmount);
		
		System.out.print("Please Cash ===> ");
		cash = sc.nextLine();
		test.payMent(cash , totalAmount);
		
		
		
	}

}
