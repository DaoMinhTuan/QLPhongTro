package com.example.myapplication.model;

import java.util.Date;

public class HoaDon {
    private int maHoaDon;
    private int maPhong;
    private int maKhach;
    private int maDV;
    private int maHopDong;
    private Date ngayTao;
    private int soLuong;
    private int trangThaiHD;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, int maPhong, int maKhach, int maDV, int maHopDong, Date ngayTao, int soLuong, int trangThaiHD) {
        this.maHoaDon = maHoaDon;
        this.maPhong = maPhong;
        this.maKhach = maKhach;
        this.maDV = maDV;
        this.maHopDong = maHopDong;
        this.ngayTao = ngayTao;
        this.soLuong = soLuong;
        this.trangThaiHD = trangThaiHD;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
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

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThaiHD() {
        return trangThaiHD;
    }

    public void setTrangThaiHD(int trangThaiHD) {
        this.trangThaiHD = trangThaiHD;
    }
}
