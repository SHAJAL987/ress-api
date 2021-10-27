package com.springboot.app.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.api.model.Employee;
import com.springboot.app.api.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	/*
	 * Insert Data Into Employee Table
	 * METHOD : POST
	 * URL    : http://localhost:8080/api/v1/employees
	 */
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	/*
	 *  Get Data from Employee Table 
	 *  METHOD : GET
	 *  URL    : http://localhost:8080/api/v1/employees
	 */
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	/*
	 *  Get Data By Id from Employee Table 
	 *  METHOD : GET
	 *  URL    : http://localhost:8080/api/v1/employees/1
	 */
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeId), HttpStatus.OK);
		
	}
	
	/*
	 *  Update Data By Id from Employee Table 
	 *  METHOD : PUT
	 *  URL    : http://localhost:8080/api/v1/employees/1
	 */
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,
			                                       @RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
		
	}
	
	/*
	 *  Delete Data By Id from Employee Table 
	 *  METHOD : DELETE
	 *  URL    : http://localhost:8080/api/v1/employees/1
	 */
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee Deleted Successfully : "+id,HttpStatus.OK);
	}
	
		
}
