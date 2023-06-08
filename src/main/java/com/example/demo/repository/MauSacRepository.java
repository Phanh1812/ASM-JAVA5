package com.example.demo.repository;

import com.example.demo.model.MauSac;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface MauSacRepository extends JpaRepository<MauSac, UUID> {
    ArrayList<MauSac> findByTen(String name);
}
