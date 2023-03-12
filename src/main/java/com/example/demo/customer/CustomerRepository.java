package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CustomerRepository  implements CustomerRepo{

    @Override
    public List<Customer> getCustomers(){
        //TODO connect to a real DB
        return Collections.emptyList();
    }
}
