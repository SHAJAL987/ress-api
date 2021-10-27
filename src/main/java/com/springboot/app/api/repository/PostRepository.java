package com.springboot.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.api.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
