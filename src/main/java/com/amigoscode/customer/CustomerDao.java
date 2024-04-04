package com.amigoscode.customer;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface CustomerDao {
    List<Customer> selectAllCustomers();

    Optional<Customer> selectCustomerById(Integer id);
}
