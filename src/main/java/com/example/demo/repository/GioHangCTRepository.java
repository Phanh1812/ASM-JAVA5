package com.example.demo.repository;

import com.example.demo.model.GioHangCT;
import com.example.demo.model.IdGioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GioHangCTRepository extends JpaRepository<GioHangCT, IdGioHangChiTiet> {
}
