package com.springboot.app.api.service;

import java.util.List;


import com.springboot.app.api.model.Post;

public interface PostService {
	
	//Get Post
	List<Post> getPost();
	
	//Insert Post
	Post savePost(Post post);
	
}
