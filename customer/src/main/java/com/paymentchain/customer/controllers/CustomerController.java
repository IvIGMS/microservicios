package com.paymentchain.customer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentchain.customer.models.Customer;
import com.paymentchain.customer.models.dto.CustomerDTO;
import com.paymentchain.customer.services.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/customer") 
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/list")
    public ResponseEntity<List<Customer>> list() {
        List<Customer> customers = customerService.list();
        return ResponseEntity.status(HttpStatus.OK).body(customers);
    }

    @PostMapping("/create")
    public ResponseEntity<Customer> create(@RequestBody CustomerDTO customerDTO) {
        Customer customer = customerService.create(customerDTO);
        return ResponseEntity.ok(customer);
    }
    
}
