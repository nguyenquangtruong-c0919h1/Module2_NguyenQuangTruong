package com.example.pagination.controller;

import com.example.pagination.model.Customer;
import com.example.pagination.model.Province;
import com.example.pagination.service.CustomerService;
import com.example.pagination.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class CustomerController {
    //Autowired ko hien thi do ko tim thay thu muc Service
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    //Cach de gan ds provices vaof tat ca cac model cua view
    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("/customer")
    public ModelAndView listCustomer(@RequestParam("s") Optional<String> s,@PageableDefault(size = 2) Pageable pageable){
        Page<Customer> customers;
        if (s.isPresent()){
            customers = customerService.findAllByFirstNameContaining(s.get(),pageable);
        }else{
            customers = customerService.findAll(pageable);
        }
        return new ModelAndView("/customer/list","customers",customers);
    }

    @GetMapping("/create-customer")
    public ModelAndView showFormCreate(){
        return new ModelAndView("/customer/create","customer",new Customer());
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message","New Customer Created Successfully !!!");
        return modelAndView;
    }
    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id){
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id){
        Customer customer = customerService.findById(id);
        if(customer != null) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customer);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:/customer";
    }
}
