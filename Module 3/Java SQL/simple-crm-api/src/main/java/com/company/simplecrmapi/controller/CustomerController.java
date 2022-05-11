package com.company.simplecrmapi.controller;

import com.company.simplecrmapi.dto.Customer;
import com.company.simplecrmapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public  class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @RequestMapping(value="/customer", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAllCustomers(@RequestParam(required=false) String company) {
        if (company != null) {
            return customerRepository.findByCompany(company);
        }
        return customerRepository.findAll();
    }

}

