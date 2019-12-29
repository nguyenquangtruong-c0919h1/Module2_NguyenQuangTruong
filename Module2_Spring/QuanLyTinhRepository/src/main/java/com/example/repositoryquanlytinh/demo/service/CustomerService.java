package com.example.repositoryquanlytinh.demo.service;

import com.example.repositoryquanlytinh.demo.model.Customer;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);


}
