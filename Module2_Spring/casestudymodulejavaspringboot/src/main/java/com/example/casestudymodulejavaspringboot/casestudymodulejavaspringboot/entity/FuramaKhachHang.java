package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class FuramaKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_khach_hang")
    private Long idKhachHang;
    @Column(name = "id_loai_khach")
    private Long idLoaiKhach;
    @Column(name = "ho_ten")
    private String name;
    @Column(name = "ngay_sinh")
    private Date brithday;
    @Column(name = "so_cmnd")
    private Long soCMND;
    @Column(name = "sdt")
    private Long phone;
    @Column(name = "email")
    private String email;

    public FuramaKhachHang() {
    }

    public FuramaKhachHang(Long idLoaiKhach, String name, Date brithday, Long soCMND, Long phone, String email) {
        this.idLoaiKhach = idLoaiKhach;
        this.name = name;
        this.brithday = brithday;
        this.soCMND = soCMND;
        this.phone = phone;
        this.email = email;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Long getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(Long idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public Long getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(Long soCMND) {
        this.soCMND = soCMND;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
