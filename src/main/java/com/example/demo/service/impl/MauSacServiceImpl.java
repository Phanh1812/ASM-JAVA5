package com.example.demo.service.impl;

import com.example.demo.model.MauSac;
import com.example.demo.model.SanPham;
import com.example.demo.repository.MauSacRepository;
import com.example.demo.repository.SanPhamRepository;
import com.example.demo.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class MauSacServiceImpl implements MauSacService {
    @Autowired
    MauSacRepository mauSacRepository;

    @Override
    public MauSac them(MauSac mauSac) {
        return mauSacRepository.save(mauSac);
    }

    @Override
    public void xoa(UUID id) {
        mauSacRepository.deleteById(id);

    }

    @Override
    public MauSac detail(UUID id) {
        return mauSacRepository.getReferenceById(id);
    }

    @Override
    public void upDate(MauSac mauSac) {
        mauSacRepository.save(mauSac);

    }

    @Override
    public ArrayList<MauSac> getAll() {
        return (ArrayList<MauSac>) mauSacRepository.findAll();
    }
}
