package com.example.demo.service.impl;

import com.example.demo.model.HoaDon;
import com.example.demo.model.KhachHang;
import com.example.demo.repository.HoaDonRepository;
import com.example.demo.repository.KhachHangRepository;
import com.example.demo.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    HoaDonRepository hoaDonRepository;

    @Override
    public ArrayList<HoaDon> getAll() {
        return (ArrayList<HoaDon>) hoaDonRepository.findAll();
    }
}
