package com.kumsal.spring.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kumsal.spring.entity.Customer;

@Repository
public class CustomerDAOImpl  implements CustomerDAO{

	@Autowired
	private SessionFactory sesssinF;
	
	@Override
	public List<Customer> getCustomer() {
		Session session=sesssinF.getCurrentSession();
		
		Query<Customer> theQuery=session.createQuery("from Customer",Customer.class);
		
		List<Customer>  rresult=theQuery.getResultList();
		
		
		return rresult;
	}
	

}
