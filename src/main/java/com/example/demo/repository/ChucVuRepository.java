package com.example.demo.repository;

import com.example.demo.model.ChucVu;
import com.example.demo.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ChucVuRepository extends JpaRepository<ChucVu, UUID> {
    void deleteById(String id);

    Optional<ChucVu> findById(String id);
}
