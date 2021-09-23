package com.verasmobile.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verasmobile.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
