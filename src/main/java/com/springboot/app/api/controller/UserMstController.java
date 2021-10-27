package com.springboot.app.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.app.api.model.UserMst;
import com.springboot.app.api.service.UserMstService;

@RestController
@RequestMapping("/api/v01/createuser")
public class UserMstController {

	private UserMstService userMstService;

	public UserMstController( UserMstService userMstService) {
		super();
		this.userMstService = userMstService;
	}
	
	/*
	 * Insert Data Into MS_USER_MST Table
	 * METHOD : POST
	 * URL    : http://localhost:8080/api/v01/createuser
	 */
	
	@PostMapping()
	public ResponseEntity<UserMst> saveUserMst(@RequestBody UserMst userMst){
		return new ResponseEntity<UserMst>(userMstService.saveUserMst(userMst), HttpStatus.CREATED);
	}
	
	/*
	 * Get Data Into MS_USER_MST Table
	 * METHOD : GET
	 * URL    : http://localhost:8080/api/v01/createuser
	 */
	@GetMapping
	 public List<UserMst> getAllUser(){
		 return userMstService.getAllUser();
	 }
	
	/*
	 *  Get Data By Id from UserMst Table 
	 *  METHOD : GET
	 *  URL    : http://localhost:8080/api/v1/createuser/1
	 */
	@GetMapping("{id}")
	public ResponseEntity<UserMst> getUserId(@PathVariable("id") long userId){
		return new ResponseEntity<UserMst>(userMstService.getUserId(userId), HttpStatus.OK);
		
	}
	
	
	
}
