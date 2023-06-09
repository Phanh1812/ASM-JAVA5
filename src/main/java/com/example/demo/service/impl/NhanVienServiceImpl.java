package com.example.demo.service.impl;

import com.example.demo.model.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    NhanVienRepository nhanVienRepository;

    @Override
    public NhanVien them(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public void xoa(UUID id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public NhanVien detail(UUID id) {
        return nhanVienRepository.getReferenceById(id);
    }

    @Override
    public void upDate(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public ArrayList<NhanVien> getAll() {
        return (ArrayList<NhanVien>) nhanVienRepository.findAll();
    }
}
