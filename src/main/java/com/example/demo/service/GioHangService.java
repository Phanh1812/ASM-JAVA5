package com.example.demo.service;
import com.example.demo.model.GioHang;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public interface GioHangService {
    GioHang them( GioHang gioHang) ;

    public void xoa(UUID id);

    GioHang detail(UUID id);

    void upDate(GioHang gioHang);

    public ArrayList<GioHang> getAll();
}
