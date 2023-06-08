package com.example.demo.service;

import com.example.demo.model.ChucVu;
import com.example.demo.model.MauSac;

import java.util.ArrayList;
import java.util.UUID;

public interface MauSacService {

    MauSac them(MauSac mauSac) ;

    public void xoa(UUID id);

    MauSac detail(UUID id);

    void upDate(MauSac mauSac);

    public ArrayList<MauSac> getAll();
}
