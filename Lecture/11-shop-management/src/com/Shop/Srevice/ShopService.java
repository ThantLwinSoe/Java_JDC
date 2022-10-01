package com.Shop.Srevice;

import java.util.List;

import com.Shop.DTO.Item;
import com.Shop.DTO.ItemCategory;

public interface ShopService {
	
	void addOrUpdate(Item item);
	void delete(int id);
	List<Item> showAll();
	Item search(int id, String name, int price,int quantity,ItemCategory category);
	Item findById(int id);

}
