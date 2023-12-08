package com.hookfish.EcommerceAPI.repository;

import com.hookfish.EcommerceAPI.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List findCustomersWithNoOrders() {
        String sql = "SELECT c.* FROM Customer c LEFT JOIN Orders o ON c.id = o.customer_id WHERE o.customer_id IS NULL";
        return entityManager.createNativeQuery(sql, Customer.class).getResultList();
    }
}

