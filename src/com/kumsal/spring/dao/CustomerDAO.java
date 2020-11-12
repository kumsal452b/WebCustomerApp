package com.kumsal.spring.dao;

import java.util.List;

import com.kumsal.spring.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);
}
