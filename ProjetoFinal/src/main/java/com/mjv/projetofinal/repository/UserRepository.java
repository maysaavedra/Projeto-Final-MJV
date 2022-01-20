package com.mjv.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.projetofinal.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
