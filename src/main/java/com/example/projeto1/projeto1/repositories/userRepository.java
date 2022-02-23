package com.example.projeto1.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto1.projeto1.entities.User;

public interface userRepository extends JpaRepository<User, Long> {

}
