package com.example.sonudeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value = "/home")
    public String home(){
        return "Hello World!";
    }
   
    @GetMapping("/home2")
    public String home2(){
        return "Hello World 2!";
    }

//    comment
}
