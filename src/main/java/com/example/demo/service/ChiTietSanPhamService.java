package com.example.demo.service;

import com.example.demo.model.ChiTietSanPham;

import java.util.ArrayList;
import java.util.UUID;

public interface ChiTietSanPhamService {

    ChiTietSanPham them(ChiTietSanPham chiTietSanPham);

    public void xoa(UUID id);

    ChiTietSanPham detail(UUID id);

    void upDate(ChiTietSanPham chiTietSanPham);

    public ArrayList<ChiTietSanPham> getAll();
}
