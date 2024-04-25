package com.dauphine.blogger.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dauphine.blogger.controller.Category;



public interface CategoryServices {
    

	public List<Category> RetrieveCategories();

	public Category getCategoryById(Long id);

	public Category updateCategoryName(Long id, Category category);

	public Category createCategory(Category category);

	public void deleteCategory(Long id);
}
