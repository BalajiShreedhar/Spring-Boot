package com.example.service;

import com.example.domain.Customer;
import com.example.domain.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Balaji on 04-12-2015.
 */
@Service
public class CustomerServiceImpl implements  CustomerService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Customer add(String firstName, String lastName) {
        Customer customer= new Customer(firstName,lastName);
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
}
