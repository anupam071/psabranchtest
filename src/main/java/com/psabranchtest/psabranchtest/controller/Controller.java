package com.psabranchtest.psabranchtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello"  )
    public void sayhello(){
        System.out.println("hello");
    }
}
