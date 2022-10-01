package com.Shop.Controller;

import com.Shop.DTO.ShopOperation;
import com.Shop.Srevice.ShopService;
import com.Shop.Util.ShopUtil;

public class ShopController {
	
	private ShopService shopservice;
	
	public void start() {
		
		doOperation(ShopOperation.values()[showMenu() - 1]);
		

	}
	
	private void doOperation(ShopOperation ope){
		switch(ope) {
		case Add -> addOrUpdate(true);
		case Update -> addOrUpdate(false);
		case Delete -> delete();
		case ShowAll -> showMenu();
		case Search -> search();
		
		default -> throw new IllegalArgumentException("UnH " + ope);
		}
	}
	
	private void  search() {
		// TODO Auto-generated method stub
		System.out.println("Search");
	}

	private void delete() {
		System.out.println("Delete");
	}

	private void addOrUpdate(boolean b) {
		System.out.println("T");
	}

	private int showMenu() {
		for(ShopOperation ope : ShopOperation.values()) {
			System.out.println(ope);
		}
		return  ShopUtil.readInt("Enter menu : ");
	}

}
