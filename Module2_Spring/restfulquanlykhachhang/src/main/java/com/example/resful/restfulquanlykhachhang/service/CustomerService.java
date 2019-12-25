package com.example.resful.restfulquanlykhachhang.service;

import com.example.resful.restfulquanlykhachhang.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
