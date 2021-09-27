package com.verasmobile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verasmobile.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
