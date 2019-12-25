package com.example.resful.restfulquanlykhachhang;

import com.example.resful.restfulquanlykhachhang.repository.CustomerRepository;
import com.example.resful.restfulquanlykhachhang.repository.imple.CustomerRepositoryImpl;
import com.example.resful.restfulquanlykhachhang.service.CustomerService;
import com.example.resful.restfulquanlykhachhang.service.imple.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestfulquanlykhachhangApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulquanlykhachhangApplication.class, args);
    }
    @Bean
    public CustomerRepository customerRepository(){
        return new CustomerRepositoryImpl();
    }

    @Bean
    public CustomerService customerService(){
        return new CustomerServiceImpl();
    }
}
