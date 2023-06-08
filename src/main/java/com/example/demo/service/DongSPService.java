package com.example.demo.service;
import com.example.demo.model.DongSP;
import com.example.demo.model.MauSac;
import java.util.ArrayList;
import java.util.UUID;

public interface DongSPService {

    DongSP them(DongSP dongSP);

    public void xoa(UUID id);

    DongSP detail(UUID id);

    void upDate(DongSP dongSP);

    public ArrayList<DongSP> getAll();
}
