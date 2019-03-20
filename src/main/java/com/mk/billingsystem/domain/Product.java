package com.mk.billingsystem.domain;

public class Product {
	
	private String name;
	
	private String scanCode;
	private ProductType productType;

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	private boolean isDiscountable;

	public String getPriceCurrency() {
		return priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	private double priceAmount;
	private String priceCurrency;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScanCode() {
		return scanCode;
	}

	public void setScanCode(String scanCode) {
		this.scanCode = scanCode;
	}

	public boolean isDiscountable() {
		return isDiscountable;
	}

	public void setDiscountable(boolean isDiscountable) {
		this.isDiscountable = isDiscountable;
	}

	public double getPriceAmount() {
		return priceAmount;
	}

	public void setPriceAmount(double priceAmount) {
		this.priceAmount = priceAmount;
	}
}
