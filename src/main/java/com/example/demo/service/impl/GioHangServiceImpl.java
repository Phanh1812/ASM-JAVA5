package com.example.demo.service.impl;

import com.example.demo.model.GioHang;
import com.example.demo.repository.GioHangRepository;
import com.example.demo.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
@Service
public class GioHangServiceImpl implements GioHangService {
    @Autowired
    private GioHangRepository gioHangRepository;
    @Override
    public GioHang them(GioHang gioHang) {
        return gioHangRepository.save(gioHang);
    }

    @Override
    public void xoa(UUID id) {
       gioHangRepository.deleteById(id);
    }

    @Override
    public GioHang detail(UUID id) {
        return gioHangRepository.getReferenceById(id);
    }

    @Override
    public void upDate(GioHang gioHang) {
         gioHangRepository.save(gioHang);
    }

    @Override
    public ArrayList<GioHang> getAll() {
        return (ArrayList<GioHang>) gioHangRepository.findAll();
    }
}
