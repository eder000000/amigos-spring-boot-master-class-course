package com.example.demo.customer;


import java.util.Arrays;
import java.util.List;

public class customerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
                new Customer(1L, "James Bond", "pass123"),
                new Customer(2L, "Bond girl", "123password")
        );
    }
}
