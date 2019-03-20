package com.mk.billingsystem.services;

import java.util.List;

import com.mk.billingsystem.domain.*;

public class BillCalculatorServiceImpl implements BillCalculatorService {

	private static final int DISCOUNT_PER_HUNDRED = 5;

	public Bill calculateTotalPayableAmount(Customer customer, List<Item> items) {
		double totalDiscountedPrice = 0;
		double totalPriceAfterDiscount = 0;
		Bill bill = new Bill();
		double discountPercentage = getDiscountPercentageForCustomer(customer);
		for(Item item:items) {
			totalPriceAfterDiscount = totalPriceAfterDiscount+(item.getTotalCost() - item.getDiscountedPrice(discountPercentage));
			totalDiscountedPrice = totalDiscountedPrice + item.getDiscountedPrice(discountPercentage);
		}
		double discountOnBill = getDiscountBasedOnTotalAmount(totalPriceAfterDiscount);
		bill.setCustomerId(customer.getCustomerID());

		bill.setNetDiscount(totalDiscountedPrice+discountOnBill);
		bill.setNetPaybleAmount(Math.round(totalPriceAfterDiscount - discountOnBill));
		return bill;
	}


	private double getDiscountPercentageForCustomer(Customer customer) {
		CustomerType customerType = customer.getCustomerType();
		double discount = DiscountType.valueOf(customerType.toString()).getDiscountPercentage();
		if(discount > 0) {
			return discount;

		}
		return 0;
	}
	
	private double getDiscountBasedOnTotalAmount(double totalDiscountedPrice) {
		return Math.floor(totalDiscountedPrice / 100) * DISCOUNT_PER_HUNDRED;
	}
}
