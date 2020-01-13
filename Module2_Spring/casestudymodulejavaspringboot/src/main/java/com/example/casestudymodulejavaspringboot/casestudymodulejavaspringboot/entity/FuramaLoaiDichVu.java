package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class FuramaLoaiDichVu {
    @Id
    @Column(name = "id_loai_dich_vu")
    private Long idLoaiDichVu;
    @Column(name = "ten_loai_dich_vu")
    private String tenLoaiDichVu;
    @OneToMany(targetEntity = FuramaDichVu.class)
    private List<FuramaDichVu> furamaDichVus;

    public FuramaLoaiDichVu() {
    }

    public Long getIdLoaiDichVu() {
        return idLoaiDichVu;
    }

    public void setIdLoaiDichVu(Long idLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public List<FuramaDichVu> getFuramaDichVus() {
        return furamaDichVus;
    }

    public void setFuramaDichVus(List<FuramaDichVu> furamaDichVus) {
        this.furamaDichVus = furamaDichVus;
    }
}
