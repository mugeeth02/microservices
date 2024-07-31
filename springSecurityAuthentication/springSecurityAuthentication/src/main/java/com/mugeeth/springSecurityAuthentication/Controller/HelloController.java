package com.mugeeth.springSecurityAuthentication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHelloAll(){
        return "Hello Everyone";
    }

    @GetMapping("/user")
    public String sayHelloUser(){
        return "Hello User";
    }
    @GetMapping("/admin")
    public String sayHelloAdmin(){
        return "Hello Admin";
    }
}
