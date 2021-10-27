package com.springboot.app.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.app.api.model.GroupMst;
import com.springboot.app.api.service.GroupMstService;

@RestController
@RequestMapping("/api/v01/createGroup")
public class GroupMstController {
	
	private GroupMstService groupMstService;

	public GroupMstController(GroupMstService groupMstService) {
		super();
		this.groupMstService = groupMstService;
	}
	
	@PostMapping()
	public ResponseEntity<GroupMst> savegroupMst(@RequestBody GroupMst groupMst){
		return new ResponseEntity<GroupMst>(groupMstService.savegroupMst(groupMst), HttpStatus.CREATED);
	}
	
	/*
	 *  Get Data By Id from Employee Table 
	 *  METHOD : GET
	 *  URL    : http://localhost:8080/api/v01/createGroup/1
	 */
	@GetMapping("{id}")
	public ResponseEntity<GroupMst> getGroupCode(@PathVariable("id") long id){
		return new ResponseEntity<GroupMst>(groupMstService.getGroupCode(id), HttpStatus.OK);
		
	}
	
}
