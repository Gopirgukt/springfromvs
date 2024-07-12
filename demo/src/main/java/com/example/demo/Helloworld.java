package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @GetMapping("/hellogopi")
    public String helloWorld() {
        return "Hello, World!";
    }
}
