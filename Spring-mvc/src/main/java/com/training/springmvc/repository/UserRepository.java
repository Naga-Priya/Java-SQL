package com.training.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springmvc.model.User;
public interface UserRepository extends JpaRepository<User, Integer>{

	//Repository has methods for most query operations
}
