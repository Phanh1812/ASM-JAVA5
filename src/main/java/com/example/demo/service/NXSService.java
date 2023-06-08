package com.example.demo.service;

import com.example.demo.model.ChucVu;
import com.example.demo.model.DongSP;
import com.example.demo.model.NXS;

import java.util.ArrayList;
import java.util.UUID;

public interface NXSService {
    NXS them(NXS nxs) ;

    public void xoa(UUID id);

    NXS detail(UUID id);

    void upDate(NXS nxs);
    public ArrayList<NXS> getAll();
}
