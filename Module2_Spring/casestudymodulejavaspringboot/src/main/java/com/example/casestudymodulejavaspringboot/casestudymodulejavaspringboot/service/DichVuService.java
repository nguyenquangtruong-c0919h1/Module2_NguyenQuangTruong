package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.service;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;

import javax.management.openmbean.OpenDataException;
import java.util.Optional;

public interface DichVuService {
    Iterable<FuramaDichVu> getAllDicVu();

    Optional<FuramaDichVu> getDichvu(Long id);

    void saveDichVu(FuramaDichVu furamaDichVu);

    void remove(Long id);
}
