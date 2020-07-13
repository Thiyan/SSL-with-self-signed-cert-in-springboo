package com.yanmakes.SslProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello all You're seeing a protected website";
    }
}
