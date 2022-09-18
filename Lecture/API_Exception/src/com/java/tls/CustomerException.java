package com.java.tls;

public class CustomerException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private CustomerException (String name) {
		super(name);
	}
	
	final static  class BlankException extends CustomerException {
		
		public BlankException(String name) {
			super(name);
		}
	}
	
	final static  class EmptyException extends CustomerException {
		
		public EmptyException(String name) {
			super(name);
		}
	}
}
