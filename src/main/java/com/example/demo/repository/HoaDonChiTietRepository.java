package com.example.demo.repository;

import com.example.demo.model.HoaDonChiTiet;
import com.example.demo.model.IdHoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet, IdHoaDonChiTiet> {
}
