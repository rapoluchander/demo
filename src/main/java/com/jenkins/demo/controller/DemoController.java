package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getname")
    public String getName(){
        return "hellow Paripoorna";
    }
}
