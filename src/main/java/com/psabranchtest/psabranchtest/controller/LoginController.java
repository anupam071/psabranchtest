package com.psabranchtest.psabranchtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/")
    public void test(){
        System.out.println("added new controller ");
    }
}
