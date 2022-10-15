package com.tls;

import java.util.function.Predicate;

public class Demo {
	public static void main(String [] args) {
		
		Predicate<Integer> p = a -> (a>10);
		var ok = p.test(20);
		
		System.out.println(ok);
	}
}


