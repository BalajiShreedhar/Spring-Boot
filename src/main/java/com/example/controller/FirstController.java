package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Balaji on 03-12-2015.
 */
@RestController
public class FirstController {

    @RequestMapping("/")
    public String hello(){
        return "Hello.. Its First Spring boot Trial";
    }

    @RequestMapping(value = "/hello/{firstName}")
    public String hello(@PathVariable("firstName") String firstName){
        return "Hello "+firstName+".. Its First Spring boot Trial";
    }


    @RequestMapping(value = "/hello/{firstName}/{lastName}")
    public String printName(@PathVariable("firstName") String firstName,@PathVariable("lastName")String lastName){
        return "Hello "+firstName+" "+lastName+".. Its First Spring boot Trial";
    }
}
