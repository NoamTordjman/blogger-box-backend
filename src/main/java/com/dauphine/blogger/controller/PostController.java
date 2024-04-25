package com.dauphine.blogger.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dauphine.blogger.Services.PostServices;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
	@RequestMapping("/v1/posts")
	@Tag(name = "Post API", description = "Endpoints for managing posts")
	public class PostController {

	    
	    @Autowired
	    private final PostServices postServices;
	    
	    public PostController(PostServices postServices) {
	    	this.postServices = postServices;
	    }

	    @GetMapping
	    @Operation(summary = "Retrieve all posts ordered by creation date", description = "Retourne une liste de tous les postes rangés par date de création")
	    public List<Post> RetrieveByCreationDate() {
	        return postServices.RetrieveByCreationDate();
	    }

	    @GetMapping("/category/{categoryId}")
	    @Operation(summary = "Retrieve all posts per a category", description = "Retourne une liste de post appartenant à la catégorie")
	    public List<Post> RetrievePost(@PathVariable Long categoryId) {
	        return postServices.RetrievePost();
	    }

	    @PostMapping
	    @Operation(summary = "Create a new post", description = "Créer un nouveau post")
	    public Post createPost(@RequestBody String title) {
	        return postServices.createPost(title);
	    }

	    @PutMapping("/{id}")
	    @Operation(summary = "Update an existing post", description = "Mettre à jour le post avec un ID spéifique")
	    public Post updatePost(@PathVariable UUID id, @RequestBody String title) {
	        return postServices.updatePost(id, title);
	    }

	    @DeleteMapping("/{id}")
	    @Operation(summary = "Delete an existing post", description = "Supprimé le post avec un ID spécifique")
	    public boolean deletePost(@PathVariable UUID id) {
	    	return postServices.deletePost(id);
	    }
	}


