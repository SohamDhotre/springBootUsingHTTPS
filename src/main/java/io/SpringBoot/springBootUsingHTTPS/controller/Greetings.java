package io.SpringBoot.springBootUsingHTTPS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/greetings")
    public String sayHello() {
        return "Hello, Secure World!";
    }
}
