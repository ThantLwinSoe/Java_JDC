package com.tls;

import java.util.ArrayList;
import java.util.List;

public class AfterGeneric {
	
	public static void main(String [] args) {
		List<Person> list = new ArrayList<>();
//		list.add(new Student());
//		list.add(new Teacher());
		
		print(list);
	}
	
	public static void print(List<Person> list) {
		for(Person l : list) {
		//	System.out.println(l);
			
			if(l instanceof Student) {
				System.out.println("This is student object");
			} else {
				System.out.println("This is Teacher Object");
			}
		}
	}
}
