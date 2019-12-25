package com.example.repossitoryquanlykhachhang.demo.service.imple;

import com.example.repossitoryquanlykhachhang.demo.model.Customer;
import com.example.repossitoryquanlykhachhang.demo.repository.CustomerRepository;
import com.example.repossitoryquanlykhachhang.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
