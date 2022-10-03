package com.tls;
import java.util.Scanner;

import com.tls.util.MyException;
import com.tls.util.Registration;
import com.tls.util.SignIn;

public class Factory {
	
	private static Scanner sc;
	
	
	static {
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		
		String exit;
		
//		String option;
		
		do {
			// 1st Window 
			System.out.println("************* Hello Welcom ************");
			System.out.println("Do you have an account?");
			System.out.println("Please choose yes or no");
			
			optional(sc.nextLine());
			
			System.out.println("Do you want to exit?");
			System.out.println("Please type yes: ");
			exit = sc.nextLine();
		} while(!exit.equalsIgnoreCase("yes"));
		
//		Registration.getRegistration().storeInfo();
//		System.out.println(Registration.getInfo().get(1).getEmail());
		
		
		
		
	}
	
	public static void optional(String option) {
		
		
		if(option.equalsIgnoreCase("yes")) {
			SignIn si = new SignIn();
			si.siginInEmail();
			si.siginInPassword();
			try {
				si.check();
			} catch(MyException e) {
				System.out.println(e.getMessage());
				System.out.println("Please create!!!!");
			}
			
		} else if(option.equalsIgnoreCase("no")) {
			
			System.out.println("Do you want create account?");
			System.out.println("Please Type yes: ");
			
			if(sc.nextLine().equalsIgnoreCase("yes")) {
				Registration.getRegistration().storeInfo();
			} else {
				System.out.println("Thanks for interesting!!!");
			}
			
		} else {
			System.out.println("Thanks for interesting!!!");
		}
		
	}
	
	
	

}
