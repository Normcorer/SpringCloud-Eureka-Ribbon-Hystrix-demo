package com.example.demo.Controller;

import com.example.demo.Service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {
    @Autowired
    private ServiceB serviceB;
    @RequestMapping("/hello")
    public String sayHi(){
        return  serviceB.sayHi();
    }
}
