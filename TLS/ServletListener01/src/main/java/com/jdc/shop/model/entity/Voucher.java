package com.jdc.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voucher implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private LocalDateTime saleDate;
	private String customer;

	private List<SaleItem> list;

	public Voucher() {
		list = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDateTime saleDate) {
		this.saleDate = saleDate;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public List<SaleItem> getList() {
		return list;
	}

	public void setList(List<SaleItem> list) {
		this.list = list;
	}

}
