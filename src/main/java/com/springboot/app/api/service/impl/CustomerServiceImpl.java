package com.springboot.app.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.api.model.Customer;
import com.springboot.app.api.repository.CustomerRepository;
import com.springboot.app.api.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> getCustomerList() {
		return customerRepository.findAll();
	}

}
