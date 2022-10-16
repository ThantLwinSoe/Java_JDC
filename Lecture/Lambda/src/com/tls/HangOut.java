package com.tls;

import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class HangOut {

	public static void main(String[] args) {
		
		IntPredicate fun1 = a -> a < 5 ;
		System.out.println(fun1.test(20));
		
		Predicate<Integer> fun2 = a -> a > 8;
		System.out.println(fun2.test(90));
		
		Consumer<String> fun3 = a -> System.out.println("Hey " + a);
		fun3.accept("ALex");
		
	//	BiCousumer<>

	}

}
