package com.dauphine.blogger.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dauphine.blogger.controller.Post;

public interface PostServices {

	List<Post> RetrieveByCreationDate();

	List<Post> RetrieveCategory();

	public Post createPost();

	public Post updatePost();

	public void deletePost();

}
