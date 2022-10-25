package com.example.myapplication.model;

public class KhachThue {
    private int maKhach;
    private String hoTen;
    private String soDienThoai;
    private int cmnd;
    private int maPhong;

    public KhachThue() {
    }

    public KhachThue(int maKhach, String hoTen, String soDienThoai, int cmnd, int maPhong) {
        this.maKhach = maKhach;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
        this.maPhong = maPhong;
    }

    public int getMaKhach() {
        return maKhach;
    }

    public void setMaKhach(int maKhach) {
        this.maKhach = maKhach;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
}
