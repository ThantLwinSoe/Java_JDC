package com.tls;

import java.util.stream.IntStream;

public class Others {

	public static void main(String[] args) {
		
		IntStream.of(1,2,3,4,5,9,2,3,4,5,6)
				 .distinct()
				 .sorted()
				 .forEach(System.out :: println);
		
		IntStream.range(1, 10000)
				 .parallel()
				 .forEachOrdered(System.out :: println);
	}

}
