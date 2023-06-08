package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "GioHangCT")
@Table(name = "gio_hang_chi_tiet")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GioHangCT {
    @EmbeddedId
    private IdGioHangChiTiet id;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "don_gia")
    private Double donGia;

    @Column(name = "don_gia_khi_giam")
    private Double donGiaKhiGiam;
}
