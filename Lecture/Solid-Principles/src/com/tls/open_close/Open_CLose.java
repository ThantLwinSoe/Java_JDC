package com.tls.open_close;

public class Open_CLose {
	
	public static void main(String [] args) {
		GoldenFish fish = new GoldenFish();
		Dog dog = new Dog();
		
		System.out.println(fish.getMeal()+ " " + fish.getType());
		
		System.out.println(dog.getMeal()+ " "+ dog.getType()+" "+ dog.getTeach());
	}
}
