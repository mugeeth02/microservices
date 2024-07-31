package com.mugeeth.configPropertiesActuator.controller;

import com.mugeeth.configPropertiesActuator.model.ApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired //Wires the object from spring container
    private ApiConfig apiConfig;
    @GetMapping("/hello") //http://localhost:8080/hello
    public String sayHello(){
        return apiConfig.getHost() + " "
                +apiConfig.getPort() + " "
                +apiConfig.getTimeout();
    }
}

//http://localhost:8080/actuator/health
//http://localhost:8080/actuator/env
//http://localhost:8080/actuator/configprops
//http://localhost:8080/actuator/beans
//http://localhost:8080/actuator/mappings

