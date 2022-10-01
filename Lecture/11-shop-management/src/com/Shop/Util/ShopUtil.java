package com.Shop.Util;

import java.util.Scanner;

public class ShopUtil {
	
	private static Scanner sc = new Scanner(System.in);
	private ShopUtil() {
		
	}
	
	public static int readInt(String message) {
		System.out.println(message);
		while(true) {
			
			try {
				return Integer.parseInt(readString(message));
			}catch (NumberFormatException e) {
				System.out.println("Please input Digit only ...");
			}
			
		}
		//return null;
	}
	
	public static String readString(String message) {
		System.out.println(message);
		return sc.nextLine();
	}

}
