package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    List<Customer> getCustomer(){
        return customerService.getCustomer();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path="{customerId}")
    void DeleteCustomer(@PathVariable("customerId")Long id){
        System.out.println("DELETE REQUEST FOR CUSTOMER WITH ID:" + id);
    }
}
