package com.example.demo.Controller;

import com.example.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/consumer")
    public String ConsumerA(){
        return customerService.helloService();
    }
}
