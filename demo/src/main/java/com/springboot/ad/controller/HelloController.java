package com.springboot.ad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //Default for GET
    //Else have to mention specific method
    
    @RequestMapping("/hello")
    public String sayHelloWorld(){
        return "Hello World!!!";
    }
}
