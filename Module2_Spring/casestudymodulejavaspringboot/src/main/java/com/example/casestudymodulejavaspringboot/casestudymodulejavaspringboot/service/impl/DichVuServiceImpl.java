package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.impl;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.repository.RepositoryDichVu;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class DichVuServiceImpl implements DichVuService {
    @Autowired
    RepositoryDichVu repositoryDichVu;

    @Override
    public Iterable<FuramaDichVu> getAllDicVu() {
        return repositoryDichVu.findAll();
    }

    @Override
    public Optional<FuramaDichVu> getDichvu(Long id) {
        return repositoryDichVu.findById(id);
    }

    @Override
    public void saveDichVu(FuramaDichVu furamaDichVu) {
        repositoryDichVu.save(furamaDichVu);
    }

    @Override
    public void remove(Long id) {
        repositoryDichVu.deleteById(id);
    }
}
