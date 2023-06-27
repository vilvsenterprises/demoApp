package com.example.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/execute")
    public String execute(){
        return "Hi there! So glad to see you.";
    }
}
