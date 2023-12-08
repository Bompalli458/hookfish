package com.hookfish.EcommerceAPI.repository;
import com.hookfish.EcommerceAPI.entity.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersWithNoOrders();
}

