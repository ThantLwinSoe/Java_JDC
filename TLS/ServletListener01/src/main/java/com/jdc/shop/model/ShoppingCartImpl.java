package com.jdc.shop.model;

import java.util.ArrayList;
import java.util.List;

import com.jdc.shop.model.entity.Product;
import com.jdc.shop.model.entity.SaleItem;

class ShoppingCartImpl implements ShoppingCart{
	
	private static final long serialVersionUID = 1L;
	private List<SaleItem> list;
	
	public ShoppingCartImpl() {
		list = new ArrayList<SaleItem>();
	}
	
	@Override
	public void add(Product p) {
		
		var saleItem = findItemByProduct(p);
		
		if(saleItem == null) {
			saleItem = new SaleItem();
			saleItem.setProduct(p);
			list.add(saleItem);
			
		}
		
		saleItem.addOne();
		
	}
	
	private SaleItem findItemByProduct(Product p) {
		
		for(SaleItem sale : list) {
			
			if(sale.getProduct().getId() == p.getId()) {
				return sale;
			}
		}
		
		return null;
	}

	@Override
	public int itemCount() {
		int count = 0;
		for(SaleItem saleItem : list) {
			count += saleItem.getCount();
		}
		return count;
	}

	@Override
	public void clear() {
		list.clear();
		
	}

	@Override
	public int total() {
		int total = 0;
		for(SaleItem item : list) {
			total += item.getTotal();
		}
		return total;
	}

	@Override
	public List<SaleItem> items() {
		
		return new ArrayList<>(list);
	}
	
	

}
