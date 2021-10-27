package com.springboot.app.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.api.model.Customer;
import com.springboot.app.api.service.CustomerService;

@RestController
@RequestMapping("/api/oneToMany")
public class CustomerController {
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	/*
	 *  Get Data from Employee Table 
	 *  METHOD : GET
	 *  URL    : http://localhost:8080/api/oneToMany
	 */
	
	public List<Customer> getAllCustomerInfo(){
		return customerService.getCustomerList();
	}
}
