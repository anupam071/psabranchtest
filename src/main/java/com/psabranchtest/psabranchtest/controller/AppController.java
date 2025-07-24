package com.psabranchtest.psabranchtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/say")
    public String helloWorld() {
        return "Hello, PSA Branch Test!";
    }
}
