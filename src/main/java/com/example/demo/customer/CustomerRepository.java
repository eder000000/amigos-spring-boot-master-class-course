package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepository  implements CustomerRepo{

    @Override
    public List<Customer> getCustomers(){
        //TODO connect to a real DB
        return Collections.singletonList(
                new Customer(1L, "TODO. Implement real DB", "password")
        );
    }
}
