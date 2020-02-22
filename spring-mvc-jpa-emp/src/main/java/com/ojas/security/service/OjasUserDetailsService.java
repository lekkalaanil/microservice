package com.ojas.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ojas.security.UserRepository;
import com.ojas.security.entity.User;

public class OjasUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		
		User user= repository.findByUsername(username);
		
		if(user!=null)
			return user;
		else
		{
			throw new UsernameNotFoundException("please, check the use name and try again..");
		}
		
	}

}
