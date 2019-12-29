package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "dichvu")
public class FuramaDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TenDichVu")
    private Long tenDichVu;

    @Column(name = "DienTich")
    private int dienTich;

    @Column(name = "SoTang")
    private int soTang;

    @Column(name = "SoNguoiToiDa")
    private int soNguoiToiDa;

    @Column(name = "ChiPhiThue")
    private int chiPhiThue;

    @Column(name = "IDKieuThue")
    private int idKieuThue;
    @ManyToOne
    @JoinColumn(name = "IDLoaiDichVu")
    private FuramaLoaiDichVu furamaLoaiDichVu;

    public FuramaDichVu() {
    }

    public Long getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(Long tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getIdKieuThue() {
        return idKieuThue;
    }

    public void setIdKieuThue(int idKieuThue) {
        this.idKieuThue = idKieuThue;
    }

    public FuramaLoaiDichVu getFuramaLoaiDichVu() {
        return furamaLoaiDichVu;
    }

    public void setFuramaLoaiDichVu(FuramaLoaiDichVu furamaLoaiDichVu) {
        this.furamaLoaiDichVu = furamaLoaiDichVu;
    }
}
