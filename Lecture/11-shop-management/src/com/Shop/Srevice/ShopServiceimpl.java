package com.Shop.Srevice;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.List;

import com.Shop.DTO.Item;
import com.Shop.DTO.ItemCategory;

public class ShopServiceimpl implements ShopService {
	
	private static ShopServiceimpl instance;
	
	private ShopServiceimpl(){
	//	repo = ShopRepoimpl.
		
	}
	
	public static ShopServiceimpl getInstance() {
		return instance = instance == null ? new ShopServiceimpl() : instance;
	}

	@Override
	public void addOrUpdate(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Item> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item search(int id, String name, int price, int quantity, ItemCategory category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
