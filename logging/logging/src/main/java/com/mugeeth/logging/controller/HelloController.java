package com.mugeeth.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/hello")
    public String sayHello(){

//        logger.info("Hello info Level");
        logger.debug("Hello Debug Level");
        return "HELLO";
    }
}
