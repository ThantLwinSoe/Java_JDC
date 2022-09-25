package com.tls;

import java.util.ArrayList;
import java.util.List;

public class FactoryPair {
	public static void main(String[] args) {
		
		List<OrderPair> list = new ArrayList<>(); 
		list.add(new OrderPair("GreenApple", 1500));
		list.add(new OrderPair("RedApple", 1000));
		list.add(new OrderPair("Yellow", 3000));	
		
	//	printCheapApple(list);
		printRedApple(list);
	}
	
	public static void printYellowApple(List<OrderPair> list) {
		list.stream()
			.filter(a -> a.getKey().toLowerCase().trim().contains("greenapple"))
			.forEach(a -> {
				System.out.println("Green Apple = " + a.getKey() 
				+ "( " + a.getValue() + " )" );
			});
	}
	
	public static void printRedApple(List<OrderPair> list) {
		for(OrderPair p : list) {
			if( p.getKey().equalsIgnoreCase("RedApple")) {
				System.out.println(p.getKey());
			}
		}
	}

	public static void printCheapApple(List<OrderPair> list) {
//		System.out.println("This is Cheap Apple "+(list.get(1).k));
//		System.out.println("This is Cheap Apple Price"+(list.get(1).v));
		for(OrderPair p : list) {
		
		}
		
	}
	
	public static void printExpensiveApple(List<OrderPair> list) {
		System.out.println();
	}
}
