package com.springboot.app.api.service;

import java.util.List;

import com.springboot.app.api.model.UserMst;

public interface UserMstService {
	
	//Create User
	UserMst saveUserMst(UserMst userMst);
	
	//Get All User
	List<UserMst> getAllUser();
	
	// Get User By Id
	UserMst getUserId(Long id);
	
}
