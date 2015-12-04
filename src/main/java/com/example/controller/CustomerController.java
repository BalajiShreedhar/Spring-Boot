package com.example.controller;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Balaji on 04-12-2015.
 */

/*
Controller to try Spring boot with Jpa
http://localhost:8080/configprops = to see the configs
 */
@RestController
@RequestMapping("/jpa")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "addCustomer/{fname}/{lname}")
    public ResponseEntity<Customer> addCustomer(@PathVariable("fname") String firstName,
                                                @PathVariable("lname") String lastName) {
        Customer customer = customerService.add(firstName, lastName);
        return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
    }

    @RequestMapping(value = "getAllCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

}
