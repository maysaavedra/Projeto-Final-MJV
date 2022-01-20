package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.User;
import com.mjv.projetofinal.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> listarCadastros(){
		return repository.findAll();
	}
	@PostMapping
	public void salvar(@RequestBody User cadastro){
		repository.save(cadastro);
	}
//	@PutMapping
//	public void alterar(@RequestBody User cadastro){
//		service.salvarCadastro(cadastro);
//	}
	@DeleteMapping(path = "/{id}")
	public void alterar(@PathVariable("id") Integer id){//pegadinha
		repository.deleteById(id);
	}
}
