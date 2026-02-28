package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Включает автоконфигурацию и сканирование компонентов [22, 23]
public class FirstProjectApplication {

    public static void main(String[] args) {
        // Запуск Spring приложения [24, 25]
        SpringApplication.run(FirstProjectApplication.class, args);
    }
}