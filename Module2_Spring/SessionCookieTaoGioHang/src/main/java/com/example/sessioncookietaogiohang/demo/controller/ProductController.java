package com.example.sessioncookietaogiohang.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    @GetMapping("/menu")
    public ModelAndView menu(){
        ModelAndView modelAndView = new ModelAndView("/menu");
        return modelAndView;
    }
}
