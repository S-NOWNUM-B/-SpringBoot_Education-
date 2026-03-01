package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Привет! Твой первый проект на Spring Boot успешно запущен!";
	}
}
