package com.example.demo.repository;

import com.example.demo.model.DongSP;
import com.example.demo.model.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HoaDonRepository extends JpaRepository<HoaDon, UUID> {
}
