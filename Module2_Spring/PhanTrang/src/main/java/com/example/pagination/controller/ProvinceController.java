package com.example.pagination.controller;

import com.example.pagination.model.Customer;
import com.example.pagination.model.Province;
import com.example.pagination.service.CustomerService;
import com.example.pagination.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/province")
    public ModelAndView listProvince(){
        return new ModelAndView("province/list","provinces",provinceService.findAll());
    }

    @GetMapping("/create-province")
    public ModelAndView createProvince(){
        return new ModelAndView("province/create","province",new Province());
    }

    @PostMapping("/create-province")
    public ModelAndView saveProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("province",province);
        modelAndView.addObject("message","Create Province Successfully !!!");
        return modelAndView;
    }

    @GetMapping("/edit-province/{id}")
    public ModelAndView showFormEdit(@PathVariable Integer id){
        Province province = provinceService.findById(id);
        if(province != null){
            return new ModelAndView("province/edit","province",province);
        }else {
            return new ModelAndView("error.404");
        }
    }

    @PostMapping("/edit-province")
    public ModelAndView editProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("province/edit");
        modelAndView.addObject("province",province);
        modelAndView.addObject("message","Edit Province Successfully !!!");
        return modelAndView;
    }

    @GetMapping("/delete-province/{id}")
    public ModelAndView showFormDelete(@PathVariable Integer id){
        Province province = provinceService.findById(id);
        if (province != null){
            return new ModelAndView("province/delete","province",province);
        }else{
            return new ModelAndView("error.404");
        }
    }

    @PostMapping("/delete-province")
    public String deleteProvince(@ModelAttribute("province") Province province){
        provinceService.remove(province.getId());
        return "redirect:/province";
    }

    @GetMapping("/view-province/{id}")
    public ModelAndView viewProvince(@PathVariable("id") Integer id){
        Province province = provinceService.findById(id);
        if (province == null){
            return new ModelAndView("error.404");
        }
        Iterable<Customer> customers = customerService.findByAllProvince(province);
        ModelAndView modelAndView = new ModelAndView("/province/view");
        modelAndView.addObject("province",province);
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
}
