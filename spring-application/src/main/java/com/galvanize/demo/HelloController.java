package com.galvanize.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greeting() {
        return "Hello from Spring!";
    }

    @GetMapping("/cats")
    public String getCats() {
        return "ALL THE CATS";
    }
}
