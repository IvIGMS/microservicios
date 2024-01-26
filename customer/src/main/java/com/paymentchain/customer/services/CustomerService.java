package com.paymentchain.customer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentchain.customer.models.Customer;
import com.paymentchain.customer.repositories.CustomerRepository;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> list(){
        return customerRepository.findAll();
    }
    
}