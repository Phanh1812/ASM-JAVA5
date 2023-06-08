package com.example.demo.service.impl;

import com.example.demo.model.KhachHang;
import com.example.demo.model.NhanVien;
import com.example.demo.repository.KhachHangRepository;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.KhachHangService;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public KhachHang them(KhachHang khachHang){
        return khachHangRepository.save(khachHang);
    }

    @Override
    public void xoa(UUID id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public KhachHang detail(UUID id) {
        return khachHangRepository.getReferenceById(id);
    }

    @Override
    public void upDate(KhachHang khachHang) {
         khachHangRepository.save(khachHang);
    }

    @Override
    public ArrayList<KhachHang> getAll() {
        return (ArrayList<KhachHang>) khachHangRepository.findAll();
    }

}
