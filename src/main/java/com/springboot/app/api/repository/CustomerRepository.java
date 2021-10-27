package com.springboot.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.api.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
