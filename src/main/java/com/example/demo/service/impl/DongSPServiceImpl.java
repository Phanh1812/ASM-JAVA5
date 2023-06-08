package com.example.demo.service.impl;

import com.example.demo.model.ChucVu;
import com.example.demo.model.CuaHang;
import com.example.demo.model.DongSP;
import com.example.demo.repository.DongSPRepository;
import com.example.demo.service.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class DongSPServiceImpl implements DongSPService {
    @Autowired
    DongSPRepository dongSPRepository;

    @Override
    public DongSP them(DongSP dongSP){
        return dongSPRepository.save(dongSP);
    }

    @Override
    public void xoa(UUID id) {
        dongSPRepository.deleteById(id);
    }

    @Override
    public DongSP detail(UUID id) {
        return dongSPRepository.getReferenceById(id);
    }

    @Override
    public void upDate(DongSP dongSP) {
        dongSPRepository.save(dongSP);
    }

    @Override
    public ArrayList<DongSP> getAll() {
        return (ArrayList<DongSP>) dongSPRepository.findAll();
    }
//    @Scheduled(fixedRate = 100)
//    public void inlinhtinh(){
//        System.out.println("xin chào");
//    }
}
