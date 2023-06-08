package com.example.demo.repository;

import com.example.demo.model.DongSP;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface DongSPRepository extends JpaRepository<DongSP, UUID> {
    ArrayList<DongSP> findByTen(String name);
}
