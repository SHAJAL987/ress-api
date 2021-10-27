package com.springboot.app.api.service;

import java.util.List;

import com.springboot.app.api.model.Employee;

public interface EmployeeService {
	//Insert Data Service
	Employee saveEmployee(Employee employee);
	
	//Get Data
	List<Employee> getAllEmployees();
	
	//Get Data By Id
	Employee getEmployeeById (long id);
	
	//Update data
	Employee updateEmployee(Employee employee, long id);
	
	//Delete data
	void deleteEmployee(long id);
	
}
