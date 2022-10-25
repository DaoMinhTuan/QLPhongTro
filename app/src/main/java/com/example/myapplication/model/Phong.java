package com.example.myapplication.model;

public class Phong {
    private int maPhong;
    private int soPhong;
    private int trangThaiP ;

    public Phong() {
    }

    public Phong(int maPhong, int soPhong, int trangThaiP) {
        this.maPhong = maPhong;
        this.soPhong = soPhong;
        this.trangThaiP = trangThaiP;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public int getTrangThaiP() {
        return trangThaiP;
    }

    public void setTrangThaiP(int trangThaiP) {
        this.trangThaiP = trangThaiP;
    }
}
