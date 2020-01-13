package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.Controller;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class FuramaDichVuController {
    @Autowired
    DichVuService dichVuService;

    @GetMapping("/")
    public ModelAndView showService(@RequestParam(value = "fromPrince", required = false) Integer fromPrince,
                                    @RequestParam(value = "toPrince", required = false) Integer toPrince) {
        ModelAndView modelAndView = new ModelAndView("/home");
        if (fromPrince == null || toPrince == null) {
            modelAndView.addObject("dichVuService", dichVuService.getAllDichVu());
        } else {
            modelAndView.addObject("dichVuService", dichVuService.findAllByChiPhiThueBetween(fromPrince, toPrince));
        }
        return modelAndView;
    }

    @GetMapping("/views/dichvu/{id}")
    public ModelAndView showServiceDetail(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/views/dichvu/showService");
        modelAndView.addObject("dichVuChiTiet", dichVuService.getDichvu(id));
        return modelAndView;
    }


}