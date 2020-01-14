package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.impl;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaKhachHang;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.repository.RepositoryKhachHang;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceIpml implements KhachHangService {
    @Autowired
    RepositoryKhachHang repositoryKhachHang;
    @Override
    public Iterable<FuramaKhachHang> findAll() {
        return repositoryKhachHang.findAll();
    }

    @Override
    public FuramaKhachHang findById(Long id) {
        return repositoryKhachHang.findById(id).orElse(null);
    }

    @Override
    public void save(FuramaKhachHang furamaKhachHang) {
repositoryKhachHang.save(furamaKhachHang);
    }

    @Override
    public void remove(Long id) {
repositoryKhachHang.deleteById(id);
    }
}
