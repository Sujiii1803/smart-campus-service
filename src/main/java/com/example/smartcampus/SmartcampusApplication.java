package com.example.smartcampus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@EnableMethodSecurity
@SpringBootApplication
public class SmartcampusApplication {

    public static void main(String[] args) {

        SpringApplication.run(SmartcampusApplication.class, args);
    }

}
