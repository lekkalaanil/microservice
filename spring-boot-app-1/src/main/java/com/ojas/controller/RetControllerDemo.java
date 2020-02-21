package com.ojas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetControllerDemo {
	
	@GetMapping("/")
	String home()
	{
		return "home";
	}
}
