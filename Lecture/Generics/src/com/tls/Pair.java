package com.tls;

public class Pair<Key,Value> {
	
	public Key k;
	public Value v;
	
	Pair(Key k , Value v ){
		this.k = k;
		this.v = v;
	}
	
	public Key getKey() {
		return this.k;
	}
	
	public Value getValue() {
		return this.v;
	}
}
