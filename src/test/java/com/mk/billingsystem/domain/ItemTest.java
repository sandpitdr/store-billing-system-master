package com.mk.billingsystem.domain;

import com.mk.billingsystem.base.BillingSystemBuilder;
import org.junit.Assert;
import org.junit.Test;

public class ItemTest {
	
	
	@Test
	public void shouldGetNoDiscountForNonDiscountableProduct() {
		Product product = BillingSystemBuilder.getNonDiscountableProduct();
		Item item = new Item(product, 4);
		Assert.assertEquals(0, item.getDiscountedPrice(5), 0);
	}
	
	@Test
	public void shouldGetDiscountedPriceForDiscountableProduct() {
		Product product = BillingSystemBuilder.getDiscountableProduct();
		Item item = new Item(product, 4);
		Assert.assertEquals(11.8, item.getDiscountedPrice(5), 0.1);
	}
	
	@Test
	public void shouldGetNoDiscountForZeroDiscountPercentage() {
		Product product = BillingSystemBuilder.getDiscountableProduct();
		Item item = new Item(product, 4);
		Assert.assertEquals(0, item.getDiscountedPrice(0), 0);
		
	}

}
