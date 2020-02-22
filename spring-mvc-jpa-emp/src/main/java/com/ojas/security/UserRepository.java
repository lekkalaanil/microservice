package com.ojas.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
}
