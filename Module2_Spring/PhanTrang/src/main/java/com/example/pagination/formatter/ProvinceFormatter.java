package com.example.pagination.formatter;

import com.example.pagination.model.Province;
import com.example.pagination.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

//Lớp ProvinceFormatter sử dụng provinceService để chuyển đổi từ id của province sang object của province.
@Component
public class ProvinceFormatter implements Formatter<Province> {

    private ProvinceService provinceService;

    @Autowired
    public ProvinceFormatter(ProvinceService provinceService){
        this.provinceService = provinceService;
    }
    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return provinceService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Province object, Locale locale) {
        return "["+object.getId()+","+object.getName()+"]";
    }
}
