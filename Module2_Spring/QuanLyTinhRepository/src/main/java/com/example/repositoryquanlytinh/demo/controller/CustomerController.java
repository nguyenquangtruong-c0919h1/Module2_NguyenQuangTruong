package com.example.repositoryquanlytinh.demo.controller;

import com.example.repositoryquanlytinh.demo.model.Customer;
import com.example.repositoryquanlytinh.demo.repository.CustomerRepository;
import com.example.repositoryquanlytinh.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("views/customer/create");
        modelAndView.addObject("customer", new Customer() );
        return modelAndView;
    }
    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){

        customerRepository.save(customer);

        ModelAndView modelAndView = new ModelAndView("/views/customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully");
        return modelAndView;
    }

}

