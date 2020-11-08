package com.kumsal.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kumsal.spring.dao.CustomerDAO;
import com.kumsal.spring.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel){
		
		List<Customer> theCostumer=customerDAO.getCustomer();
		
		theModel.addAttribute("customer",theCostumer);
		return "list-customers";
	}
}
