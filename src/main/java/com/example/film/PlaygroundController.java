package com.example.film;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaygroundController {

    @GetMapping("/helloworld")
    public String helloWorld()
    {
        return "Hello world";
    }
}
