package com.verasmobile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verasmobile.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
