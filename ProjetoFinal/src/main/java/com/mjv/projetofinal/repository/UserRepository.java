package com.mjv.projetofinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjv.projetofinal.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
   
    List<User> findByName(String name);


      

}
