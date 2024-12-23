package com.jenkins.demo.controller;

import com.jenkins.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    public DemoService demoService;

    @GetMapping("/getname")
    public String getName(){
        return "Welcome "+demoService.getName();
    }
}
