package com.example.demo.repository;


import com.example.demo.model.NhanVien;
import com.example.demo.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface SanPhamRepository extends JpaRepository<SanPham, UUID> {
    ArrayList<SanPham> findByTen(String name);
}
