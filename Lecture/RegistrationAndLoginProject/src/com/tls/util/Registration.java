package com.tls.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
	
	private UserName username;
	private Email email;
	private Password password;
	private ConfirmPassword conPassword;
	private  static ArrayList<Person> info ;
	
	private Registration() {
		
	}
	
	private Scanner sc;
	
	{
		sc = new Scanner(System.in);
	}
	
	public static Registration getRegistration() {
		return new Registration();
	}
	
	public static ArrayList<Person> getInfo()  {
		return info;
	}
	
	public void storeInfo() {
		
		
		System.out.printf("\t Enter user name: ");
		username = new UserName(sc.nextLine());
		
		System.out.println("\t Enter Email: ");
		email = new Email(sc.nextLine());
		
		System.out.println("\t Enter Password: ");
		password = new Password(sc.nextLine());
		
//		System.out.println("\t Enter Confirm Password: ");
//		conPassword = new ConfirmPassword(sc.nextLine());
		
		List<Person> list = List.of(username,email,password); // 1,2 main
		
		info = new ArrayList<>(list);
		
		System.out.println("Congratulation You have an account!!!");
		
	}
	
	

}
