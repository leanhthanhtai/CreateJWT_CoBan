package com.example.levanTai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaAuditing
public class LevanTai18093421RegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LevanTai18093421RegisterApplication.class, args);
    }

}
