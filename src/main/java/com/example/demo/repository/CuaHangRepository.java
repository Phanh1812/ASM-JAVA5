package com.example.demo.repository;

import com.example.demo.model.CuaHang;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
    ArrayList<CuaHang> findByTen(String name);
}
