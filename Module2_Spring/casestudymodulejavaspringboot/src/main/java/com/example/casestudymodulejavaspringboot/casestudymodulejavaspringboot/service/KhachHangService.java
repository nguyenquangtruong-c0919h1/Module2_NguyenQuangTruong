package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaKhachHang;

public interface KhachHangService {
    Iterable<FuramaKhachHang> findAll();
    FuramaKhachHang findById(Long id);
    void save(FuramaKhachHang furamaKhachHang);
    void remove(Long id);
}
