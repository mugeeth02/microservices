package com.mugeeth.springSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping //we can run without rest mapping also
public class HelloController { //http://localhost:8080/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "HELLO WORLD";
    }
}
