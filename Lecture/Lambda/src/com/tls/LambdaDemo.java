package com.tls;

import java.util.function.Predicate;

public class LambdaDemo {
	public static void main(String[] args) {
		
		// Predicate<Type> in Lambda
		Predicate<Person> obj = p -> p.getAge() >= 10 ;
		var t = obj.test(new Person("Ryan" , 40));	
		System.out.println(t);
		
		
		// Object Type in Lambda Type
//		PersonInterface  pf = p -> p.getName();
//		String total = pf.getName(new Person("thant", 20));
		
//		System.out.println(total);
		
		/*	Calculate cal = new Calculate() {
			public void sum(int i, int j, int l) {
				System.out.println("Anonymous Total: " + (i+j+l));
			}
			
			public void othersum(int i) {
				System.out.println(i);
			} 
		};
		
		cal.sum(10, 20 ,50);
		
		withLambda(); 
		*/
		
//		Multiply test = (a,b) -> {
//			int i = Integer.parseInt(b);
//			return Integer.toString(a*i);
			
//			return 
//		};
		
//		System.out.println( test.multi(10, "5") );

	}
	
	public static void withLambda() {
	//	Calculate cal = (i) -> System.out.println(i);
		//cal.sum(50);
		
		Calculate cal = (i,j,l) -> System.out.println(i+j+l);
		cal.sum(90, 90, 90);
		
	} 
	
	

}
