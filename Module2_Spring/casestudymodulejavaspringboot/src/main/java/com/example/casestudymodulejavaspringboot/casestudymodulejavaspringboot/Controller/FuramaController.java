package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.Controller;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuramaController {
    @Autowired
    DichVuService dichVuService;
    @GetMapping("/home")
    public ModelAndView showService(){
        ModelAndView modelAndView = new ModelAndView("/Home","dichvuService",dichVuService.getAllDicVu());
        return modelAndView;
    }
}
