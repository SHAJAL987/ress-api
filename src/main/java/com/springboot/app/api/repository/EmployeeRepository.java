package com.springboot.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.api.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
