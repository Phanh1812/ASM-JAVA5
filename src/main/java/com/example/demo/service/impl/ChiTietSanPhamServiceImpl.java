package com.example.demo.service.impl;

import com.example.demo.model.ChiTietSanPham;
import com.example.demo.model.SanPham;
import com.example.demo.repository.ChiTietSanPhamRepository;
import com.example.demo.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {
    @Autowired
    ChiTietSanPhamRepository chiTietSanPhamRepository;

    @Override
    public  ChiTietSanPham them(ChiTietSanPham chiTietSanPham){
        return chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public void xoa(UUID id) {
        chiTietSanPhamRepository.deleteById(id);
    }

    @Override
    public ChiTietSanPham detail(UUID id) {
        return chiTietSanPhamRepository.getReferenceById(id);
    }

    @Override
    public void upDate(ChiTietSanPham chiTietSanPham) {
         chiTietSanPhamRepository.save(chiTietSanPham);
    }

    @Override
    public ArrayList<ChiTietSanPham> getAll() {
        return (ArrayList<ChiTietSanPham>) chiTietSanPhamRepository.findAll();
    }
}
