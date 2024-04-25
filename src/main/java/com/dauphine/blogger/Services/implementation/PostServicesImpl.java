package com.dauphine.blogger.Services.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dauphine.blogger.Services.PostServices;
import com.dauphine.blogger.controller.Category;
import com.dauphine.blogger.controller.CategoryRepository;
import com.dauphine.blogger.controller.Post;
import com.dauphine.blogger.controller.PostRepository;

@Service
public class PostServicesImpl implements PostServices{
	
	private final PostRepository repository;
	
	public PostServicesImpl(PostRepository repository) {
		this.repository = repository;
	}
	

	public List<Post> RetrievePost() {
		return repository.findAll();
	}

	public Post createPost(String title) {
		Post post = new Post();			
		return repository.save(post);
	}

	public Post updatePost(UUID id, String title) {
		Post post = getPostById(id);
		if(post == null) {
			return null;
		}
		post.setTitle(title);
		return repository.save(post);
	}

	public Post getPostById(UUID id) {
		return repository.findById(id) 
				.orElse(null);
	}

	public boolean deletePost(UUID id) {
		repository.deleteById(id);
		return true;
	}
	
	public List<Post> RetrieveByCreationDate() {
		return null;
	}



}
