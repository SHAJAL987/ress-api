package com.springboot.app.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.app.api.exception.ResourceNotFountException;
import com.springboot.app.api.model.UserMst;
import com.springboot.app.api.repository.UserMstRepository;
import com.springboot.app.api.service.UserMstService;


@Service
public class UserMstServiceImpl implements UserMstService {
	
	private UserMstRepository userMstRepository;
	
	public UserMstServiceImpl(UserMstRepository userMstRepository) {
		super();
		this.userMstRepository = userMstRepository;
	}

	@Override
	public UserMst saveUserMst(UserMst userMst) {
		return userMstRepository.save(userMst);
	}

	@Override
	public List<UserMst> getAllUser() {
		return userMstRepository.findAll();
	}

	@Override
	public UserMst getUserId(Long id) {
		Optional<UserMst> usermst = userMstRepository.findById(id);
		
		if(usermst.isPresent()) {
			return usermst.get();
		}else {
			throw new ResourceNotFountException("UserMst", "Id", id);
		}
	}

}
