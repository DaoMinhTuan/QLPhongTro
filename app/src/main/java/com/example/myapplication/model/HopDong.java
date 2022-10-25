package com.example.myapplication.model;

import java.util.Date;

public class HopDong {
    private int maHopDong;
    private int maPhong;
    private int maKhach;
    private int maDV;
    private int giaThue;
    private int tienCoc;
    private Date ngayBatDau;
    private Date ngayHetHan;

    public HopDong() {
    }

    public HopDong(int maHopDong, int maPhong, int maKhach, int maDV, int giaThue, int tienCoc, Date ngayBatDau, Date ngayHetHan) {
        this.maHopDong = maHopDong;
        this.maPhong = maPhong;
        this.maKhach = maKhach;
        this.maDV = maDV;
        this.giaThue = giaThue;
        this.tienCoc = tienCoc;
        this.ngayBatDau = ngayBatDau;
        this.ngayHetHan = ngayHetHan;
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getMaKhach() {
        return maKhach;
    }

    public void setMaKhach(int maKhach) {
        this.maKhach = maKhach;
    }

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public int getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }

    public int getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(int tienCoc) {
        this.tienCoc = tienCoc;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}
