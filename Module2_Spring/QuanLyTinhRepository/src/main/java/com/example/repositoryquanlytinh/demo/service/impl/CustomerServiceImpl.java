package com.example.repositoryquanlytinh.demo.service.impl;

import com.example.repositoryquanlytinh.demo.model.Customer;
import com.example.repositoryquanlytinh.demo.repository.CustomerRepository;
import com.example.repositoryquanlytinh.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerService customerService;

    @Override
    public Iterable<Customer> findAll() {
        return customerService.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerService.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerService.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerService.remove(id);
    }
}
