package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.impl;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.repository.RepositoryDichVu;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    RepositoryDichVu repositoryDichVu;

    @Override
    public Iterable<FuramaDichVu> getAllDichVu() {
        return repositoryDichVu.findAll();
    }

    @Override
    public FuramaDichVu getDichvu(Long id) {
        return repositoryDichVu.findById(id).orElse(null);
    }

    @Override
    public void saveDichVu(FuramaDichVu furamaDichVu) {
        repositoryDichVu.save(furamaDichVu);
    }

    @Override
    public void remove(Long id) {
        repositoryDichVu.deleteById(id);
    }

    @Override
    public Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrince, Integer toPrince) {
        return repositoryDichVu.findAllByChiPhiThueBetween(fromPrince,toPrince);
    }
}
