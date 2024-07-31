package com.mugeeth.valueAnnotation.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController { //http://localhost:8080/hello

//    @Value("${message}")
//    private String msg;

//      @Value("${random : default message}")
//      private String msg;

//    @Value("${name.list}")
//    private String[] msg;
    @Value("#{${mapvalues}}")  //Spring expression language
    private Map<String,Integer> testMap;
    @GetMapping("/hello")
    public Map<String, Integer> sayHello(){
        return testMap;
    }
//    @GetMapping("/hello")
//    public String[] sayHello(){
//        return testMap;
//    }

}
