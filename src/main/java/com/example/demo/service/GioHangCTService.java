package com.example.demo.service;

import com.example.demo.model.GioHangCT;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
@Service
public interface GioHangCTService {
    ArrayList<GioHangCT> getAll();

    GioHangCT add(GioHangCT gioHangCT);

    //    public GioHangCT detai(UUID idGioHang, UUID idChiTietSp);
    public GioHangCT detail(UUID idgh, UUID idctsp);
    public void delete(UUID idGioHang, UUID idChiTietSp);
}
