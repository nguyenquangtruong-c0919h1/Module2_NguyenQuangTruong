package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.impl;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaHopDong;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.repository.RepositoryHopDong;
import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class HopDongServiceImpl implements HopDongService {
    @Autowired
    RepositoryHopDong repositoryHopDong;

    @Override
    public Iterable<FuramaHopDong> getAllHopDong() {
        return repositoryHopDong.findAll();
    }

    @Override
    public FuramaHopDong getHopDong(Long id) {
        return repositoryHopDong.findById(id).orElse(null);
    }


    @Override
    public void saveHopDong(FuramaHopDong furamaHopDong) {
        repositoryHopDong.save(furamaHopDong);
    }

    @Override
    public void removeHopDong(Long id) {
        repositoryHopDong.deleteById(id);
    }
}
