package com.tls;

public class Main {

	public static void main(String[] args) {
		
		Person yes = new Person();
		
		PersonInterface p = yes :: getName;
		var s = p.showName();
		System.out.println(s);
		
		conRef();
		useLambda();
	}
	
	
	private static void conRef() {
		
		Interface2 if2 = Item :: new;
		var result = if2.show("Hello");
		System.out.println(result.getName());
	}
	
	private static void useLambda() {
		Interface2 if2 = a -> new Item(a);
		var t = if2.show("Thant").getName();
		System.out.println(t);
	}

}
