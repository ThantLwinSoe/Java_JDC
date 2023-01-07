package com.jdc.tls;

public class Sale {

	private String category;
	private String productName;
	private int price;
	private int count;
	

	public Sale(String line) {
		var array = line.split("\t");
		this.category = array[0];
		this.productName = array[1];
		this.price = Integer.parseInt(array[2]);
		this.count = Integer.parseInt(array[3]);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getTotal () {
		return count * price;
	}

}
