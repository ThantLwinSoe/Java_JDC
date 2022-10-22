package com.tls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Collections.addAll(list, new Person ("Tls" , 20 , 2500), 
							new Person ("kk", 18, 1500),
							new Person ("nn", 39, 1900),
							new Person ("ll", 25, 1800));
		
		
		List<Item> itemList = new ArrayList<>();
		Collections.addAll(itemList, new Item("Chicken", 10, 1000),
									 new Item("Onion", 20 , 2500),
									 new Item("Potato", 25, 1000),
									 new Item("Pork", 100, 15000));
		
		// a must be the person type
	//	list.stream().filter( a -> a.getAge() > 20).forEach(a -> System.out.println(a.getName()));
		
//		var str = list.stream().filter( a-> a.getName().contains("l")).mapToInt(a -> a .getSalary());
//		str.forEach(a -> System.out.println(a));
		
//		System.out.println(str.sum());
		
	//	var t = getOver20(list, a -> a.getAge() > 20);
	//	System.out.println(t);
		
		List<Item> test = getData(itemList , a -> a.getName().equalsIgnoreCase("pork"));
		System.out.println(test);
		
		
		
	}
	
	private static <T> List<T> getData(List<T> dataList, Predicate<T> data){
		List<T> list = new ArrayList<>();
		for(T t : dataList) {
			if(data.test(t)) {
				list.add(t);
			}
		}
		return list;
	}

}
