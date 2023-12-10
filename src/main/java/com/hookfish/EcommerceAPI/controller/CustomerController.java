package com.hookfish.EcommerceAPI.controller;
import com.hookfish.EcommerceAPI.entity.Customer;
import com.hookfish.EcommerceAPI.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/no-orders")
    public  ResponseEntity<?> getCustomersWithNoOrders() {
        List<Customer> customers = customerService.getCustomersWithNoOrders();
        if(!customers.isEmpty())return ResponseEntity.ok(customers);
        else return ResponseEntity.ok("All Customers Ordered At least One Product");
    }
}


