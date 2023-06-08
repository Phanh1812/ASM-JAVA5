package com.example.demo.service.impl;

import com.example.demo.model.NhanVien;
import com.example.demo.model.SanPham;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.repository.SanPhamRepository;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Override
    public SanPham them(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    @Override
    public void xoa(UUID id) {
        sanPhamRepository.deleteById(id);

    }

    @Override
    public SanPham detail(UUID id) {
        return sanPhamRepository.getReferenceById(id);
    }

    @Override
    public void upDate(SanPham sanPham) {
         sanPhamRepository.save(sanPham);

    }

    @Override
    public ArrayList<SanPham> getAll() {
        return (ArrayList<SanPham>) sanPhamRepository.findAll();
    }
}
