package com.example.service;

import com.example.domain.Customer;

import java.util.List;

/**
 * Created by Balaji on 04-12-2015.
 */
public interface CustomerService {

    Customer add(String firstName, String lastName);

    List<Customer> findAllCustomers();

}
