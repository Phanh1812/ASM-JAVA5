package com.example.demo.service;
import com.example.demo.model.ChucVu;
import com.example.demo.model.SanPham;

import java.util.ArrayList;
import java.util.UUID;

public interface SanPhamService {
   SanPham them(SanPham sanPham) ;

    public void xoa(UUID id);

    SanPham detail(UUID id);

    void upDate(SanPham sanPham);
    public ArrayList<SanPham> getAll();
}
