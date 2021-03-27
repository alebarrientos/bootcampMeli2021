package com.clase01spring.test.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanosRestController {
    @GetMapping(path = "/{name}")
    public String helloWorld(@PathVariable String name){
        return "Hello " + name;
    }
}
