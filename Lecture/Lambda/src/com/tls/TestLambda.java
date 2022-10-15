package com.tls;

public class TestLambda {
	
	public static void main(String [] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running");
			}
		});
		thread.start();
		afterLambda();
	}
	
	public static void afterLambda() {
		Thread thread = new Thread( ()-> System.out.println("Ok"));
		thread.start();
	}

}
