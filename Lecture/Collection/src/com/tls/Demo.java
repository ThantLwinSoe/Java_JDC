package com.tls;

import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		String[] str = {"Hello", "Thant" , null};
		
		List<String> list = Arrays.asList(str);
		list.add("React");
		
		list.forEach(System.out :: println);
	}

}
