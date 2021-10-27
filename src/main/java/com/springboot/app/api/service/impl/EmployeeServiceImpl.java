package com.springboot.app.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.app.api.exception.ResourceNotFountException;
import com.springboot.app.api.model.Employee;
import com.springboot.app.api.repository.EmployeeRepository;
import com.springboot.app.api.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new ResourceNotFountException("Employee", "Id", id);
		}
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
	
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFountException("Employee", "Id", id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		employeeRepository.save(existingEmployee);
		
		return existingEmployee;
	}


	@Override
	public void deleteEmployee(long id) {
		employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFountException("Employee", "Id", id));
		employeeRepository.deleteById(id);
		
	}
	
}
