package com.mohantyrohan.gateWayServer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String hello(){
        return "Hello World from the GateWay Server";
    }
}
