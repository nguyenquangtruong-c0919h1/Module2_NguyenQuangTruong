package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;

public interface DichVuService {
    Iterable<FuramaDichVu> getAllDichVu();

    FuramaDichVu getDichvu(Long id);

     void saveDichVu(FuramaDichVu furamaDichVu);

    void remove(Long id);
    public  Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrince,Integer toPrince);
}
