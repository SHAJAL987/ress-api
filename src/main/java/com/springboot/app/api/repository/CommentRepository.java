package com.springboot.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.api.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
