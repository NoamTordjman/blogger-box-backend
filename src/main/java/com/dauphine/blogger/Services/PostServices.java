package com.dauphine.blogger.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dauphine.blogger.controller.Post;

public interface PostServices {

	List<Post> RetrieveByCreationDate();

	List<Post> RetrievePost();
	
	public Post getPostById(UUID id);

	public Post createPost(String title);

	public Post updatePost(UUID id, String title);

	public boolean deletePost(UUID id);

}
