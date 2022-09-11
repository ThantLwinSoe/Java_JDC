package com.tls.open_close;

public class Dog extends Animal implements Teaching {
	
	@Override
	public String getMeal() {
		return "ok";		
	}
	@Override
	public String getType() {
		return "A";
	}
	@Override
	public String getTeach() {
		return "Hand";
	}

}
