package com.verasmobile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verasmobile.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
