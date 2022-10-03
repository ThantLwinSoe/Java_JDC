package com.tls.util;

import java.util.ArrayList;
import java.util.Scanner;

public class SignIn {
	private Email email;
	private Password password;
	private ArrayList<Email> infoEmail;
	private ArrayList<Password> infoPassword;
	private Scanner sc;
	
	{
		sc = new Scanner(System.in);
	}
	
	public void check() {
		
		String email;
		String password;
		
		try {
			// email from Registration Form
			 email = Registration.getInfo().get(1).getEmail();
			 password = Registration.getInfo().get(2).getPassword();
			
		}catch(RuntimeException e) {
			
			throw new MyException(":(( You have not Account yet!!!");

		}
		
		if(email.equals(infoEmail.get(0).getEmail())) {
			
				// check the next Password
				if(password.equals(infoPassword.get(0).getPassword())) {
					
					// Both Match 
					// Welcome Sir!!!
					System.out.println();
					System.out.println("*****************************");
					System.out.println("\t Welcome Sir!!!");
					System.out.println("\t SignIn Complete!");
					System.out.println("\t New Window is Here!!!");
					System.out.println("*****************************");
					System.out.println();
				} else {
					//System.out.println("SignIn "+infoPassword.get(0).getPassword());
					System.out.println("\t :(( Incorrect Password!!!");
				}
			} else {
			//	System.out.println("SignIn "+ infoEmail.get(0).getEmail());
				System.out.println("\t :(( Incorrect Email!!!");
			}
			
	//	} catch (RuntimeException e) {
	//		throw new MyException("\":(( You have not Account!!!\"");
	//	}
		
		
	}
	
	public void siginInEmail() {
		
		System.out.println("\t Enter Email: ");
		email = new Email(sc.nextLine());
		
		infoEmail = new ArrayList<>();
		infoEmail.add(email);
	}
	
	public void siginInPassword() {
		System.out.println("\t Enter Password: ");
		password = new Password(sc.nextLine());
		
		infoPassword = new ArrayList<>();
		infoPassword.add(password);
	}
}
