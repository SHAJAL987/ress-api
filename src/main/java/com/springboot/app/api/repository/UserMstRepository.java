package com.springboot.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.api.model.UserMst;

public interface UserMstRepository extends JpaRepository<UserMst, Long>{

}
