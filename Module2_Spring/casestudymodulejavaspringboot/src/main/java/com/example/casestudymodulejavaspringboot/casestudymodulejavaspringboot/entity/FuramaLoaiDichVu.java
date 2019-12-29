package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class FuramaLoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLoaiDichVu;
    @Column(name = "TenLoaiDichVu")
    private String tenLoaiDichVu;
    @OneToMany(targetEntity = FuramaDichVu.class)
    private List<FuramaDichVu> furamaDichVus;

    public FuramaLoaiDichVu() {
    }

    public int getIdLoaiDichVu() {
        return idLoaiDichVu;
    }

    public void setIdLoaiDichVu(int idLoaiDichVu) {
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
