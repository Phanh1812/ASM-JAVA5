package com.example.demo.service.impl;

import com.example.demo.model.DongSP;
import com.example.demo.model.NXS;
import com.example.demo.repository.DongSPRepository;
import com.example.demo.repository.NXSRepository;
import com.example.demo.service.NXSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class NXSServiceImpl implements NXSService {
    @Autowired
    NXSRepository nxsRepository;

    @Override
    public NXS them(NXS nxs) {
        return nxsRepository.save(nxs);
    }

    @Override
    public void xoa(UUID id) {
         nxsRepository.deleteById(id);
    }

    @Override
    public NXS detail(UUID id) {
        return nxsRepository.getReferenceById(id);
    }

    @Override
    public void upDate(NXS nxs) {
        nxsRepository.save(nxs);
    }

    @Override
    public ArrayList<NXS> getAll() {
        return (ArrayList<NXS>) nxsRepository.findAll();
    }
}
