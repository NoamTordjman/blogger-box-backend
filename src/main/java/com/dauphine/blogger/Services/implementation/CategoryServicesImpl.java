package com.dauphine.blogger.Services.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dauphine.blogger.Services.CategoryServices;
import com.dauphine.blogger.controller.Category;
import com.dauphine.blogger.controller.CategoryRepository;

@Service //permet que le controller vienne chercher l'implementation ici quand je définis un attriubut comme Category Services 
public class CategoryServicesImpl implements CategoryServices{
	
	
	private final CategoryRepository repository;

	public CategoryServicesImpl(CategoryRepository repository) {
		this.repository = repository;
	}

	public List<Category> RetrieveCategories() {
		return repository.findAll();
	}

	public Category getCategoryById(UUID id) {
		return repository.findById(id) 
				.orElse(null);
	}

	public Category updateCategoryName(UUID id, String name) {
		Category category = getCategoryById(id);
		if(category == null) {
			return null;
		}
		category.setName(name);
		return repository.save(category);
			}

	public Category createCategory(String name) {
		Category category = new Category(name);			
		return repository.save(category);
	}

	public boolean deleteCategory(UUID id) {
		repository.deleteById(id);
		return true;
	}


	}

