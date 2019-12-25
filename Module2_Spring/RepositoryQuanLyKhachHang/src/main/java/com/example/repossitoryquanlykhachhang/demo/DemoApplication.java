package com.example.repossitoryquanlykhachhang.demo;

import com.example.repossitoryquanlykhachhang.demo.repository.CustomerRepository;
import com.example.repossitoryquanlykhachhang.demo.repository.impl.CustomerRepositoryImpl;
import com.example.repossitoryquanlykhachhang.demo.service.CustomerService;
import com.example.repossitoryquanlykhachhang.demo.service.imple.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
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
