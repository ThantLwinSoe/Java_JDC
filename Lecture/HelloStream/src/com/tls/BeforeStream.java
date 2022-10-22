package com.tls;

import java.util.ArrayList;
import java.util.List;

public class BeforeStream {
	public static void main(String [] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		
		System.out.println(showTotal(list));
		showData(list);
	}

	private static void showData(List<Integer> list) {
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}

	private static int showTotal(List<Integer> list) {
		int total = 0;
		for(Integer i : list) {
			total += i; 
		}
		return total;
	}
	
	
}
