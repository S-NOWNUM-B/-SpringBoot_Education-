package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Помечает класс как обработчик HTTP-запросов [26-28]
public class HelloController {

    @GetMapping("/") // Связывает GET-запрос по адресу "/" с этим методом [26, 28, 29]
    public String sayHello() {
        return "Привет! Твой первый проект на Spring Boot запущен!";
    }
}