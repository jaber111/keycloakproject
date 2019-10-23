package com.jaber.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class KeycloakprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakprojectApplication.class, args);
    }

}
