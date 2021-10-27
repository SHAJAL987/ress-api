package com.springboot.app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.api.dto.OrderRequest;
import com.springboot.app.api.model.Customer;
import com.springboot.app.api.repository.CustomerRepository;

@RestController
@RequestMapping("/api/v01/order")
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		return customerRepository.save(orderRequest.getCustomer());
	}
	@GetMapping("/findAllOrders")
	public List <Customer> findAllOrders(){
		return customerRepository.findAll();
	}
	
	
}
