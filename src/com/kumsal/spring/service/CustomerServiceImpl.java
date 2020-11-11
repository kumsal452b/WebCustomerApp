package com.kumsal.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kumsal.spring.dao.CustomerDAO;
import com.kumsal.spring.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDoa;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
