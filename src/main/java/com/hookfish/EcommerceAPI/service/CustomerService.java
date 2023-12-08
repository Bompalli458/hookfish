package com.hookfish.EcommerceAPI.service;

import com.hookfish.EcommerceAPI.entity.Customer;
import com.hookfish.EcommerceAPI.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomersWithNoOrders() {
        return customerRepository.findCustomersWithNoOrders();
    }
}

