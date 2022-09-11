package com.tls.demo;

public class PaingFactroy {
	public Painting getPaint(String paid) {
		if(paid.equalsIgnoreCase("house")) {
			return new House();
		} else if(paid.equalsIgnoreCase("Hospital")) {
			return new Hospital();
		}
		
		return null;
	}
}
