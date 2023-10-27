package com.example.certdat22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return  "hello";
    }

    @GetMapping("/test/{num}")
    public String getdivnum(@PathVariable int num) {
        return  "hej = " + num;
    }

}
