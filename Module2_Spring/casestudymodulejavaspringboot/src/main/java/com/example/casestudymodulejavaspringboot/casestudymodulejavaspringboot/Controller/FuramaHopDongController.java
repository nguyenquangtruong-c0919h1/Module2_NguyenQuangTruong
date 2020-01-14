package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.Controller;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaHopDong;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.DichVuService;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.HopDongService;
import org.hibernate.tuple.entity.EntityMetamodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;


@Controller
public class FuramaHopDongController {
    @Autowired
    DichVuService dichVuService;
    @Autowired
    HopDongService hopDongService;

    @GetMapping("/views/booking/{id}")
    public ModelAndView booking(@PathVariable("id")Long id) {
        ModelAndView modelAndView = new ModelAndView("/views/booking/booking");
        FuramaDichVu furamaDichVu = dichVuService.getDichvu(id);
        modelAndView.addObject("dichVu",furamaDichVu);
return modelAndView;
    }
    @PostMapping("/views/booking")
    public ModelAndView saveBooking(@RequestParam("id")Long id, @RequestParam("ngayLamHopDong")Date ngayLamHopDong,
                                    @RequestParam("ngayKetThuc") Date ngayKetThuc){
        FuramaHopDong furamaHopDong = new FuramaHopDong();
        furamaHopDong.setIdHopDong(id);
        furamaHopDong.setNgayLamHopDong(ngayLamHopDong);
        furamaHopDong.setNgayKetThuc(ngayKetThuc);
        furamaHopDong.setIdNhanVien((long) 1);
        furamaHopDong.setIdKhachHang((long) 1);
        hopDongService.saveHopDong(furamaHopDong);
        ModelAndView modelAndView = new ModelAndView("/views/booking/successbooking");
        return modelAndView;
    }
}
