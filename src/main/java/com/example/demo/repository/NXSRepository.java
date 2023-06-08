package com.example.demo.repository;

import com.example.demo.model.DongSP;
import com.example.demo.model.NXS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface NXSRepository extends JpaRepository<NXS, UUID> {
    ArrayList<NXS> findByTen(String name);
}
