package com.example.demo.service;

import com.example.demo.model.ChucVu;
import com.example.demo.model.KhachHang;
import com.example.demo.model.NhanVien;

import java.util.ArrayList;
import java.util.UUID;

public interface KhachHangService {

    KhachHang them(KhachHang khachHang);

    public void xoa(UUID id);

    KhachHang detail(UUID id);

    void upDate(KhachHang khachHang);

    public ArrayList<KhachHang> getAll();

}
