package com.example.demo.service.impl;
import com.example.demo.model.ChucVu;
import com.example.demo.repository.ChucVuRepository;
import com.example.demo.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    ChucVuRepository chucVuRepositories;

    @Override
    public ChucVu them(ChucVu chucVu) {
        return chucVuRepositories.save(chucVu);
    }

    @Override
    public void xoa(UUID id) {
        chucVuRepositories.deleteById(id);
    }

    @Override
    public ChucVu detail(UUID id) {
        return chucVuRepositories.getReferenceById(id);
    }

    @Override
    public void upDate(ChucVu chucVu) {
        chucVuRepositories.save(chucVu);
    }


    @Override
    public ArrayList<ChucVu> getAll() {
        return (ArrayList<ChucVu>) chucVuRepositories.findAll();
    }
}
