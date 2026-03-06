package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/student")
    public String displayStudent() {
        return "ID: 101\n"
             + "Name: Allan Joe\n"
             + "Department: CSE\n"
             + "College: LICET";
    }
}
