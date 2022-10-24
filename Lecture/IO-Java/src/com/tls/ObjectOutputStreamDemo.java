package com.tls;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectOutputStreamDemo {
	
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		Collections.addAll(list, new Person("AungAung", 20), new Person("KyawKyaw" , 18));
		
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("person.obj"))){
			
			out.writeObject(list);
			System.out.println("Object wrote successfully");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
