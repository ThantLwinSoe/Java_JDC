package com.test;

import java.util.Scanner;

public class Registration {
	
	static GetterAndSetter [] people = new GetterAndSetter[2];
	
	public static void main(String[] args) {
		
//		var info = new GetterAndSetter();
		
		
		for (int i =0 ; i < people.length ; i ++) {
			
			
			people[i] = new GetterAndSetter("Alex", 25);
			
			if(i == people.length-1) {
				people[i]= new GetterAndSetter("Rosy", 23);
			}
		}
		
		var showYourFirstInfo = showMe(people[0]);
		System.out.println(showYourFirstInfo.getName());
		System.out.println(showYourFirstInfo.getAge());
		
		var showYourSecondInfo = showMe(people[1]);
		System.out.println(showYourSecondInfo.getName());
		System.out.println(showYourSecondInfo.getAge());
		
		
	}
	
	public static GetterAndSetter showMe(GetterAndSetter show) {
		
		return show;
	}

}
