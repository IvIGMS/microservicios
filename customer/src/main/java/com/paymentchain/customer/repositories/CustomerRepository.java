package com.paymentchain.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentchain.customer.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
