package com.example.repositoryquanlytinh.demo.repository;

import com.example.repositoryquanlytinh.demo.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {

}
