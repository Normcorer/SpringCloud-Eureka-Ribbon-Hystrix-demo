package com.example.demo.Controller;

import com.example.demo.Service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
    @Autowired
    private ServiceA serviceA;

    @RequestMapping("/hello")
    public String sayHi(){
        return  serviceA.sayHi();
    }
}
