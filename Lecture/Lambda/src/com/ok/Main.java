package com.ok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
			Person [] personArray = { new Person("Ko Naung" , 20) , new Person("Kola", 40) , new Person("Hsu", 23), 
				new Person("Yee", 30)};
			
			List<Person> personList = Arrays.asList(personArray);
			
			List<Person> plist = Arrays.asList(personArray);
			
			List<Person> olderthan20 = findByAge(plist);
			
			List<Person> startWithKo = findByName(plist);
			
			List<Person> result = findByPredicate(personList, a -> a.getName().contains("Y"));
			
			System.out.println(result.get(0).getName());
		}
	
//tatic <T> List<T> findByPredicate(List<? extends Person> plist , Predicate<? extends Person> p )
	
	static List<Person> findByPredicate(List<Person> plist, Predicate<Person> p){
		
		List<Person> list = new ArrayList<>();
		for(Person ok : plist) {
			if(p.test(ok)) {
				list.add(ok);
			}
		}
		return list;
	}
	
	
	
	
	
	

	private static List<Person> findByName(List<Person> plist) {
		List<Person> list = new ArrayList<>();
		
		for(Person ok : plist) {
			
			if(ok.getName().contains("Ko"))
				list.add(ok);
			}
				
		return list;
	}

	private static List<Person> findByAge(List<Person> plist) {
		
		return null;
	}

}
