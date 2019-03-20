package com.mk.billingsystem.domain;


public class Item {
	
	private Product product;
	
	private int quantity;
	
	private double totalCost;
	
	public Item(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalCost = product.getPriceAmount() * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double getTotalCost(){
		return totalCost; 
	}

	public double getDiscountedPrice(double discountPercentage) {
		if(product.isDiscountable() && discountPercentage != 0 ) {
			return (totalCost * discountPercentage/100);
		}
		return 0;
	}

}
