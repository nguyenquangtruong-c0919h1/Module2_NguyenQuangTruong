package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "dichvu")
public class FuramaDichVu {
    @Id
    @Column(name = "id_dichvu")
    private Long id;
    @Column(name = "ten_dich_vu")
    private String tenDichVu;
    @Column(name = "so_tang")
    private int soTang;
    @Column(name = "so_nguoi_toi_da")
    private int soNguoiToiDa;
    @Column(name = "dien_tich")
    private int dienTich;
    @Column(name = "id_kieu_thue")
    private int idKieuThue;
    @Column(name = "chi_phi_thue")
    private int chiPhiThue;
    @Column(name = "trang_thai")
    private String trangThai;
    @ManyToOne
    @JoinColumn(name = "id_loai_dich_vu")
    private FuramaLoaiDichVu furamaLoaiDichVu;

    public FuramaDichVu() {
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
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
