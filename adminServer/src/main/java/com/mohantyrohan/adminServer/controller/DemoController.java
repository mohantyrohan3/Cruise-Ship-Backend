package com.mohantyrohan.adminServer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello(){
        return "HELLO HELLO !!! FROM THE ADMIN SERVICE";
    }
}
