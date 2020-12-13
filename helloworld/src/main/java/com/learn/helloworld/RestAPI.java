package com.learn.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

    @GetMapping(path = "/greeting")
    public String helloWorld(@RequestParam(name="name", required = false, defaultValue = "World") String name) {
        return "Hello! " + name;
    }

}
