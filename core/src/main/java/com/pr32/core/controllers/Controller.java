package com.pr32.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/yofujitsu")
    public String sayHello() {
        return "hey! :3";
    }
}
