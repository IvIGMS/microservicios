package com.paymentchain.customer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentchain.customer.models.Customer;
import com.paymentchain.customer.models.dto.CustomerDTO;
import com.paymentchain.customer.repositories.CustomerRepository;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> list(){
        return customerRepository.findAll();
    }

    public Customer create(CustomerDTO customerDTO){
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setPhone(customerDTO.getPhone());
        // Guardamos el customer
        customerRepository.save(customer);

        return customer;
    }
    
}