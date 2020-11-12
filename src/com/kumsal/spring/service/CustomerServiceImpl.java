package com.kumsal.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kumsal.spring.dao.CustomerDAO;
import com.kumsal.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDoa;
	@Override
	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDoa.getCustomer();
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDoa.saveCustomer(theCustomer);
		
	}

}
