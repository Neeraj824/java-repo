package com.example.springsecdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String greet(){
        System.out.println("Hello World!");
        return  "Hello World!";
    }

    @GetMapping("/about")
    public String about(){
        return  "about";
    }

}
