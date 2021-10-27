package com.springboot.app.api.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.app.api.exception.ResourceNotFountException;
import com.springboot.app.api.model.GroupMst;
import com.springboot.app.api.repository.GroupMstRepository;
import com.springboot.app.api.service.GroupMstService;

@Service
public class GroupMstServiceImpl implements GroupMstService {
	
	private GroupMstRepository groupMstRepository;
	
	

	public GroupMstServiceImpl(GroupMstRepository groupMstRepository) {
		super();
		this.groupMstRepository = groupMstRepository;
	}


	@Override
	public GroupMst savegroupMst(GroupMst groupMst) {
		return groupMstRepository.save(groupMst);
	}


	@Override
	public GroupMst getGroupCode(long id) {
		Optional<GroupMst> groupmst = groupMstRepository.findById(id);
		if(groupmst.isPresent()) {
			return groupmst.get();
		}
		else {
			throw new ResourceNotFountException("GroupMst", "Id", id);
		}
	}


	

}
