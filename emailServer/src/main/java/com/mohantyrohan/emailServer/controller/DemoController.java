package com.mohantyrohan.emailServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/")
    public String index() {
        return "HELLO HELLO  !!! FROM THE EMAIL SERVER";
    }
}
