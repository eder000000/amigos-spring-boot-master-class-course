package com.example.demo.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping("/")
    Customer getCustomer(){
        return new Customer(1L, "James Bond");
    }

}
