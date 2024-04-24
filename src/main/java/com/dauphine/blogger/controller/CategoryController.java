package com.dauphine.blogger.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/v1/categories")
@Tag(name = "Category API", description = "Classe permettant de gerer les catégories")

public class CategoryController {

		private final List<Category> temporaryCategories = null;

	    @GetMapping
	    @Operation(summary = "Retrieve all categories", description = "Retourne une liste de catégories")
	    public List<Category> RetrieveCategories() {
	        return temporaryCategories;
	    }

	    @GetMapping("/{id}")
	    @Operation(summary = "Retrieve a category by id", description = "Retourne la catégorie avec l'id spécifique")
	    public Category getCategoryById(@PathVariable Long id) {
	        return new Category();
	    }

	    @PostMapping
	    @Operation(summary = "Create a new category", description = "Crée une nouvelle catégorie")
	    public Category createCategory(@RequestBody Category category) {
	        return new Category();
	    }

	    @PutMapping("/{id}")
	    @Operation(summary = "Update the name of a category", description = "met à jour le nom d'une catégorie avec l'id specifié")
	    public Category updateCategoryName(@PathVariable Long id, @RequestBody Category Category) {
	        return Category;
	    }

	    @DeleteMapping("/{id}")
	    @Operation(summary = "Delete an existing category", description = "Supprime un compte avec son id")
	    public void deleteCategory(@PathVariable Long id) {
	        return;
	    }
	}

