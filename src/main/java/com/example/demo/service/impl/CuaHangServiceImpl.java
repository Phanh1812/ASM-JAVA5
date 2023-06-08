package com.example.demo.service.impl;

import com.example.demo.model.ChucVu;
import com.example.demo.model.CuaHang;
import com.example.demo.model.NhanVien;
import com.example.demo.repository.CuaHangRepository;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class CuaHangServiceImpl implements CuaHangService {

    @Autowired
    CuaHangRepository cuaHangRepository;

    @Override
    public CuaHang them(CuaHang cuaHang){
        return  cuaHangRepository.save(cuaHang);
    }

    @Override
    public CuaHang detail(UUID id) {
        return cuaHangRepository.getReferenceById(id);
    }

    @Override
    public void upDate(CuaHang cuaHang) {
        cuaHangRepository.save(cuaHang);
    }

    @Override
    public void xoa(UUID id) {
        cuaHangRepository.deleteById(id);
    }

    @Override
    public ArrayList<CuaHang> getAll() {
        return (ArrayList<CuaHang>) cuaHangRepository.findAll();
    }
}
