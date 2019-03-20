package com.mk.billingsystem.base;

import java.util.ArrayList;
import java.util.List;

import com.mk.billingsystem.domain.*;
import org.joda.time.DateTime;

public class BillingSystemBuilder {
	
	private static final int CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS = 2;
	
	public static Product getDiscountableProduct() {
		Product product = new Product();
		product.setScanCode("MKTESPRODUCT01");
		product.setProductType(ProductType.WATCH);
		product.setName("PRODUCT1");
		product.setDiscountable(Boolean.TRUE);
		product.setPriceAmount(59);
		product.setPriceCurrency("SGD");
		return product;
	}
	public static List<Product>  getDiscountableProductList() {
		List<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setScanCode("MKTESPRODUCT01");
		product.setProductType(ProductType.WATCH);
		product.setName("PRODUCT1");
		product.setDiscountable(Boolean.TRUE);
		product.setPriceAmount(59);
		product.setPriceCurrency("SGD");
		productList.add(product);
		product = new Product();
		product.setScanCode("MKTESPRODUCT03");
		product.setProductType(ProductType.PERFUMES);
		product.setName("PRODUCT3");
		product.setDiscountable(Boolean.TRUE);
		product.setPriceAmount(49);
		product.setPriceCurrency("SGD");
		productList.add(product);
		return productList;
	}
	public static List<Product>  getNonDiscountableProductList() {
		List<Product> productList = new ArrayList<Product>();
		Product product = new Product();
		product.setScanCode("MKTESPRODUCT01");
		product.setProductType(ProductType.GROCERY);
		product.setName("PRODUCT05");
		product.setDiscountable(Boolean.FALSE);
		product.setPriceAmount(59);
		product.setPriceCurrency("SGD");
		productList.add(product);
		product = new Product();
		product.setScanCode("MKTESPRODUCT03");
		product.setProductType(ProductType.GROCERY);
		product.setName("PRODUCT04");
		product.setDiscountable(Boolean.FALSE);
		product.setPriceAmount(49);
		product.setPriceCurrency("SGD");
		productList.add(product);
		return productList;
	}
	
	public static Product getNonDiscountableProduct() {
		Product product = new Product();
		product.setScanCode("MKNONDISCOUNTPRODUCT");
		product.setName("GROCERY");
		product.setProductType(ProductType.GROCERY);
		product.setDiscountable(Boolean.FALSE);
		product.setPriceAmount(40);
		product.setPriceCurrency("SGD");
		
		return product;
	}
	
	public static Customer getAffiliateCustomer() {
		Customer customer = new Customer(CustomerType.AFFILIATE, "testCustomer001", "ABC Affiliate", new DateTime().minusYears(3));
		return customer;
	}
	
	public static Customer getEmployeeCustomer() {
		Customer customer = new Customer(CustomerType.EMPLOYEE, "testCustomer002", "Ram", new DateTime().minusYears(3));
		return customer;
	}
	
	public static Customer getCustomerWithMoreThanTwoYearOldRegistration() {
		Customer customer = new Customer(CustomerType.CUSTOMER, "testCustomer003", "Jenifer", new DateTime().minusYears(CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS).minusDays(1));
		return customer;
	}
	
	public static Customer getCustomerWithLessThanTwoYearOldRegistration() {
		Customer customer = new Customer(CustomerType.CUSTOMER, "testCustomer004", "Raj", new DateTime().minusYears(CUSTOMER_LOYALTY_TIME_PERIOD_IN_YRS).plusDays(1));
		return customer;
	}
	
	public static Item getItemWithDiscountableProduct(int quantity) {
		return new Item(getDiscountableProduct(), quantity);
	}
	
	public static Item getItemWithNonDiscountableProduct(int quantity) {
		return new Item(getNonDiscountableProduct(), quantity);
	}
	
	public static List<Item> getItemListWithMultipleProducts() {
		List<Item> items = new ArrayList<Item>();
		items.add(getItemWithDiscountableProduct(10));
		items.add(getItemWithNonDiscountableProduct(5));
		return items;
	}
	public static List<Item> getMultipleItem() {
		List<Item> items = new ArrayList<Item>();
		for (Product product:getDiscountableProductList()
			 ) {
			items.add(new Item(product,10));
		}
		for (Product product:getNonDiscountableProductList()
				) {
			items.add(new Item(product,10));
		}
		return items;
	}
}
