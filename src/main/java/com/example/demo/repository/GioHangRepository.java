package com.example.demo.repository;

import com.example.demo.model.DongSP;
import com.example.demo.model.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface GioHangRepository extends JpaRepository<GioHang, UUID> {

}