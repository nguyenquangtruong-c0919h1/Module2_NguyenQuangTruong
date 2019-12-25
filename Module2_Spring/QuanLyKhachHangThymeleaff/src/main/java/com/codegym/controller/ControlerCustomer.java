package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControlerCustomer {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("Customers", customerService.findAll());
        System.out.println("hello");
        return "index";
    }
    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("Customer", new Customer());
        return "create";
    }
}
