package com.tls;

public class EnumInterface {

	public static void main(String [] args) {

		for (Ok d : Ok.values()) {
			d.doSomething();
		}

	}
}

interface Something {

	void doSomething();
}


