package com.kumsal.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kumsal.spring.dao.CustomerDAO;
import com.kumsal.spring.entity.Customer;
import com.kumsal.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel){
		
		List<Customer> theCostumer=customerService.getCustomer();
		
		theModel.addAttribute("customer",theCostumer);
		
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		
		Customer customer=new Customer();
		
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
		
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id,Model model){
		System.out.println("Burasi calisti");
		Customer theCustomer=customerService.getCustomer(id);
		System.out.println("tanimlama "+theCustomer.getEmail() +theCustomer.getEmail());
		model.addAttribute("costumer",theCustomer);
		return "customer-form";
	}
}
