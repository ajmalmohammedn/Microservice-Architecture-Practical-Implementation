package com.learn.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

    @GetMapping(path = "/helloWorld")
    public String helloWorld() {
        return "Hello! World from SpringBoot";
    }
}
