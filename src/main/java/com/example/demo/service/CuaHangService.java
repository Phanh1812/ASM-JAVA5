package com.example.demo.service;

import com.example.demo.model.ChucVu;
import com.example.demo.model.CuaHang;
import com.example.demo.model.NhanVien;

import java.util.ArrayList;
import java.util.UUID;

public interface CuaHangService {

    public void xoa(UUID id);

    CuaHang them(CuaHang cuaHang);

    CuaHang detail(UUID id);

    void upDate(CuaHang cuaHang);

    public ArrayList<CuaHang> getAll();
}
