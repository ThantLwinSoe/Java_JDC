package com.tls;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamDemo {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.obj"))) {
			
			Object obj = in.readObject();
			List<Person> list = (List<Person>) obj;
			list.forEach(System.out :: println);
		} catch (Exception e) {
			
		}
	}
}
