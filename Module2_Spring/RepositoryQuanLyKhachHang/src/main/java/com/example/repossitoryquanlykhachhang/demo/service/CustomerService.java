package com.example.repossitoryquanlykhachhang.demo.service;

import com.example.repossitoryquanlykhachhang.demo.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
