package com.tls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class AfterStream {
	

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list,1,2,3,4,5,6,7,8,9);
		
		var stream = list.stream();
		IntStream str = stream.mapToInt(a -> a);
		
//		int total = str.sum();
//		System.out.println(total);
		str.forEach( System.out :: println);
		
	}
}
