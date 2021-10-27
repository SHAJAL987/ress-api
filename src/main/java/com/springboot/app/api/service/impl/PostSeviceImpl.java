package com.springboot.app.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.api.model.Post;
import com.springboot.app.api.repository.PostRepository;
import com.springboot.app.api.service.PostService;

@Service
public class PostSeviceImpl implements PostService{
	
	private PostRepository postRepository;

	
	public PostSeviceImpl(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}


	@Override
	public List<Post> getPost() {
		return postRepository.findAll();
	}


	@Override
	public Post savePost(Post post) {
		return postRepository.save(post);
	}

}
