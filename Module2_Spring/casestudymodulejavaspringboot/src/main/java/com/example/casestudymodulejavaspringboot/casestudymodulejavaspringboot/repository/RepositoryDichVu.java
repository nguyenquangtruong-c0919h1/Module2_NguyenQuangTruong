package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.repository;

import com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity.FuramaDichVu;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepositoryDichVu extends PagingAndSortingRepository<FuramaDichVu,Long> {
    Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrince,Integer toPrince);
}
