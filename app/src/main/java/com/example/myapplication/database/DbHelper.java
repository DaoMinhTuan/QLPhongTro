package com.example.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "QLPT";
    private static final int DB_VERSION = 1;
    //---------------------------------
    static final String CREATE_TABLE_PHONG =
            "create table Phong (maPhong INTERGER PRIMARY KEY AUTOINCREMENT, " +
                    "soPhong INTERGER NOT NULL, " +
                    "trangThaiP INTERGER NOT NULL)";
    //---------------------------------
    static final String CREATE_TABLE_KHACH_THUE =
            "create table KhachThue (maKhach INTERGER PRIMARY KEY AUTOINCREMENT, " +
                    "hoTen TEXT NOT NULL, " +
                    "soDienThoai TEXT NOT NULL," +
                    "cmnd INTERGER NOT NULL, " +
                    "maPhong INTERGER REFERENCES Phong(maPhong))";
    //---------------------------------
    static final String CREATE_TABLE_DICH_VU =
            "create table DichVu (maDV INTERGER PRIMARY KEY AUTOINCREMENT, " +
                    "tenDV TEXT NOT NULL, " +
                    "soDienThoai TEXT NOT NULL," +
                    "giaDV INTERGER NOT NULL, " +
                    "moTa TEXT NOT NULL)";
    //---------------------------------
    static final String CREATE_TABLE_HOP_DONG =
            "create table HopDong (maHopDong INTERGER PRIMARY KEY AUTOINCREMENT, " +
                    "giaThue INTERGER NOT NULL, " +
                    "tienCoc INTERGER NOT NULL," +
                    "ngayBatDau DATE NOT NULL, " +
                    "ngayHetHan DATE NOT NULL," +
                    "maPhong INTERGER REFERENCES Phong(maPhong), " +
                    "maKhach INTERGER REFERENCES KhachThue(maKhach), " +
                    "maDV INTERGER REFERENCES DichVu(maDV))";
    //---------------------------------
    static final String CREATE_TABLE_HOA_DON =
            "create table HoaDon (maHoaDon INTERGER PRIMARY KEY AUTOINCREMENT, " +
                    "ngayTao DATE NOT NULL, " +
                    "soLuong INTERGER NOT NULL," +
                    "trangThaiHD INTERGER NOT NULL," +
                    "maPhong INTERGER REFERENCES Phong(maPhong), " +
                    "maKhach INTERGER REFERENCES KhachThue(maKhach), " +
                    "maDV INTERGER REFERENCES DichVu(maDV)," +
                    "maHopDong INTERGER REFERENCES HopDong(maHopDong))";

    public DbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //tao bang Phong
        db.execSQL(CREATE_TABLE_PHONG);
        //Tao bang Khach Thue
        db.execSQL(CREATE_TABLE_KHACH_THUE);
        //Tao bang Dich Vu
        db.execSQL(CREATE_TABLE_DICH_VU);
        //Tao bang HopDong
        db.execSQL(CREATE_TABLE_HOP_DONG);
        //Tao bang Hoa Don
        db.execSQL(CREATE_TABLE_HOA_DON);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTablePhong = "drop table if exists Phong";
        db.execSQL(dropTablePhong);
        String dropTableKhachThue = "drop table if exists KhachThue";
        db.execSQL(dropTableKhachThue);
        String dropTableDichVu = "drop table if exists DichVu";
        db.execSQL(dropTableDichVu);
        String dropTableHopDong = "drop table if exists HopDong";
        db.execSQL(dropTableHopDong);
        String dropTableHoaDon = "drop table if exists HoaDon";
        db.execSQL(dropTableHoaDon);
        onCreate(db);
    }
}
