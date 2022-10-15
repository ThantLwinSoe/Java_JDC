package com.java.tls;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		try {
			System.out.println("dsf");
		} catch (CustomerException.BlankException e) {
			e.printStackTrace();
		}
		
		List<Integer> list = List.of(1,2,3);
		var test = new ArrayList<>(list);
		test.add(4);
	}

}
