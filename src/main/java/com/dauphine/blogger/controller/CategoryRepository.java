package com.dauphine.blogger.controller;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,UUID>{
	
	

}
