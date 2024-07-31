package springboot_nameMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameService {
    @GetMapping
    @RequestMapping("/name") //localhost:8081/name
    public String getName(){
        return "NAME FROM NAME API";
    }
}
