package com.capgemini.order.entity;

public class LineItem {

	
	private int itemId;
	private int quantity;
	private int productId;
	private double price;
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LineItem(int itemId, int quantity, int productId, double price) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
		this.productId = productId;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}