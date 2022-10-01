package com.Shop.Repository;

import java.util.List;

import com.Shop.DTO.Item;
import com.Shop.DTO.ItemCategory;

public class ShopRepoImpl implements ShopRepository {
	
	private static ShopRepoImpl getInstance() {
	//	return instance = instance == null ? new ShopRepo
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
