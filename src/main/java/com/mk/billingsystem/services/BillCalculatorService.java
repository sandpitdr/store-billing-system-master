package com.mk.billingsystem.services;

import java.util.List;

import com.mk.billingsystem.domain.Bill;
import com.mk.billingsystem.domain.Customer;
import com.mk.billingsystem.domain.Item;

public interface BillCalculatorService {
	
	Bill calculateTotalPayableAmount(Customer customer, List<Item> items);

}
