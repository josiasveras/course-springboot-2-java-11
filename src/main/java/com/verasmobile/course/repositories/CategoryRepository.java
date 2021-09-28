package com.verasmobile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verasmobile.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
