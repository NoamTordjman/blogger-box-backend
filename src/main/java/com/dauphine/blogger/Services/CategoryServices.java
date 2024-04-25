package com.dauphine.blogger.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dauphine.blogger.controller.Category;



public interface CategoryServices {
    

	public List<Category> RetrieveCategories();

	public Category getCategoryById(UUID id);

	public Category updateCategoryName(UUID id, String name);

	public Category createCategory(String name);

	public boolean deleteCategory(UUID id);
}
