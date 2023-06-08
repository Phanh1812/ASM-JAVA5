package com.example.demo.service;

import com.example.demo.model.ChucVu;
import com.example.demo.model.NhanVien;

import java.util.ArrayList;
import java.util.UUID;

public interface NhanVienService {

    NhanVien them(NhanVien nhanVien) ;

    public void xoa(UUID id);

    NhanVien detail(UUID id);

    void upDate(NhanVien nhanVien);


    public ArrayList<NhanVien> getAll();
}
