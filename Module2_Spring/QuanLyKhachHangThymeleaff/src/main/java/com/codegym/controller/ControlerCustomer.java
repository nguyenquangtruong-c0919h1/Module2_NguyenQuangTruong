package com.codegym.controller;

import com.codegym.service.CustomerService;
import com.codegym.service.CustomerServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ControlerCustomer {
    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("customer",customerService.findAll());
        return "index";
    }
}
