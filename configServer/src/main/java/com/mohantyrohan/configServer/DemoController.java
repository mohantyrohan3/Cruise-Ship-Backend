package com.mohantyrohan.configServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String hello(){
        return "HELLO !!!  WELCOME FROM CONFIG SERVER";
    }
}
