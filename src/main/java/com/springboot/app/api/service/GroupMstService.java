package com.springboot.app.api.service;


import com.springboot.app.api.model.GroupMst;

public interface GroupMstService {
	//Create Group
	GroupMst savegroupMst(GroupMst groupMst);
	
	//get group Code
	GroupMst getGroupCode(long id);
}
