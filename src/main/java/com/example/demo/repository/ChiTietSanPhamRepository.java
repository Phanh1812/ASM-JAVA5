package com.example.demo.repository;

import com.example.demo.model.ChiTietSanPham;
import com.example.demo.model.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChiTietSanPhamRepository extends JpaRepository<ChiTietSanPham, UUID> {

}
