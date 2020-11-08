package com.kumsal.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kumsal.spring.entity.Customer;

public class CustomerDAOImpl  implements CustomerDAO{

	@Autowired
	private SessionFactory sesssinF;

	@Override
	@Transactional
	public List<Customer> getCustomer() {
		Session session=sesssinF.getCurrentSession();
		
		
		
		return null;
	}
	

}
