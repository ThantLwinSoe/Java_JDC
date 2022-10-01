package com.Shop.DTO;

public enum ShopOperation {
	Add,Update,Delete,ShowAll,Find,Search;
	@Override
	public String toString() {
		return ordinal() + 1 + "." +name();
	}
}
