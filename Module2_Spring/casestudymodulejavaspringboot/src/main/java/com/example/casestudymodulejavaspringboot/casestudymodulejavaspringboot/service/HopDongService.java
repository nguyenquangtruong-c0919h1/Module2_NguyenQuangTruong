package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaHopDong;

import java.util.Optional;

public interface HopDongService {
    Iterable<FuramaHopDong> getAllHopDong();
    FuramaHopDong getHopDong(Long id);
    void saveHopDong(FuramaHopDong furamaHopDong);
    void removeHopDong(Long id);
}
