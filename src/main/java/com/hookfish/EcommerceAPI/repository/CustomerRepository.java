package com.hookfish.EcommerceAPI.repository;

import com.hookfish.EcommerceAPI.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

}


