package com.example.demo.service.impl;

import com.example.demo.model.ChiTietSanPham;
import com.example.demo.model.GioHang;
import com.example.demo.model.GioHangCT;
import com.example.demo.model.IdGioHangChiTiet;
import com.example.demo.repository.GioHangCTRepository;
import com.example.demo.service.GioHangCTService;
import com.example.demo.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
@Service
public class GioHangCTServiceImpl implements GioHangCTService {
    @Autowired
    GioHangCTRepository gioHangCTRepository;
    @Override
    public ArrayList<GioHangCT> getAll() {
        return (ArrayList<GioHangCT>)gioHangCTRepository.findAll();
    }

    @Override
    public GioHangCT add(GioHangCT gioHangCT) {
        return gioHangCTRepository.save(gioHangCT);
    }

    @Override
    public GioHangCT detail(UUID idgh, UUID idctsp) {
        GioHang gioHang = new GioHang();
        gioHang.setId(idgh);
        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
        chiTietSanPham.setId(idctsp);
        IdGioHangChiTiet idGioHangChiTiet = new IdGioHangChiTiet(gioHang,chiTietSanPham);
        return gioHangCTRepository.findById(idGioHangChiTiet).orElse(null);
    }

    @Override
    public void delete(UUID idGioHang, UUID idChiTietSp) {
        GioHang gioHang = new GioHang();
        gioHang.setId(idGioHang);
        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
        chiTietSanPham.setId(idChiTietSp);
        IdGioHangChiTiet idGioHangChiTiet = new IdGioHangChiTiet(gioHang,chiTietSanPham);
        gioHangCTRepository.deleteById(idGioHangChiTiet);
    }
}
