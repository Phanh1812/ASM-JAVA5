package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name= "ChiTietSanPham")
@Table(name = "chi_tiet_sp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChiTietSanPham {
    @Id
    //    @GeneratedValue(generator = "system-uuid")
    @Column(name = "Id", unique = true, nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_sp", nullable = false)
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "id_nsx",nullable = false)
    private NXS nxs;

    @ManyToOne
    @JoinColumn(name = "id_mau_sac",nullable = false)
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "id_dong_sp",nullable = false)
    private DongSP dongSP;

    @Column(name = "nam_bh")
    private Integer namBH;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_luong_ton")
    private Integer soluongTon;

    @Column(name = "gia_nhap")
    private Double giaNhap;

    @Column(name = "gia_ban")
    private Double giaBan;
}
