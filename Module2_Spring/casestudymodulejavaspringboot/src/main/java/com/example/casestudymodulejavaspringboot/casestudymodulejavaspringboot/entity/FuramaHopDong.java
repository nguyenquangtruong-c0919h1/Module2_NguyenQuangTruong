package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="hopdong")
public class FuramaHopDong {
    @Id
    @Column(name = "id_hop_dong")
    private Long idHopDong;
    @Column(name = "id_nhan_vien")
    private Long idNhanVien;
    @Column(name = "id_khach_hang")
    private Long idKhachHang;
    @Column(name = "id_dich_vu")
    private Long idDichVu;
    @Column(name = "ngay_lam_hop_dong")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ngayLamHopDong;
    @Column(name = "ngay_ket_thuc")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ngayKetThuc;
    @Column(name = "tien_dat_coc")
    private Long tienDatCoc;
    @Column(name="tong_tien")
    private Long tongTien;

    public FuramaHopDong() {
    }

    public Long getIdHopDong(Long id) {
        return idHopDong;
    }

    public void setIdHopDong(Long idHopDong) {
        this.idHopDong = idHopDong;
    }

    public Long getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Long idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
        this.idDichVu = idDichVu;
    }

    public Date getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(Date ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Long getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(Long tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;
    }
}
