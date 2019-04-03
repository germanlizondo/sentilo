package com.example.sentilo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SentiloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentiloApplication.class, args);
    }

    @GetMapping("/")
    public String index(){
        return("index");
    }
}
