package com.example.pagination.service;

import com.example.pagination.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Integer id);

    void save(Province province);

    void remove(Integer id);
}
