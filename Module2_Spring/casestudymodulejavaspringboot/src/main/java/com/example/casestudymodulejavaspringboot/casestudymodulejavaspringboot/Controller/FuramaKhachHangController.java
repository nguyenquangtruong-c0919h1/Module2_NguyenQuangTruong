package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.Controller;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaKhachHang;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuramaKhachHangController {
    @Autowired
    KhachHangService khachHangService;
    @GetMapping("/khachhang")
    public ModelAndView khachHang(){
        ModelAndView modelAndView = new ModelAndView("/khachhang/khachhang");
        modelAndView.addObject("khachhang",new FuramaKhachHang());
        return modelAndView;
    }
}
