package com.example.projeto1.projeto1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto1.projeto1.entities.User;
import com.example.projeto1.projeto1.repositories.userRepository;

@RestController
@RequestMapping(value = "/users") // criando o acesso ao usuários

public class UserController {
	
	@Autowired
	private userRepository repository;
	
	@GetMapping // endpoint para pegar a lista de todos os usuários
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}") // endpoint pegando o usuário pela sua posição 
	public User findById(@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}
	
}
