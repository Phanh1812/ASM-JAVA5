package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity(name = "KhachHang")
@Table(name = "khach_hang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KhachHang {
    @Id
//    @GeneratedValue(generator = "system-uuid")
    @Column(name = "Id", unique = true, nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ten_dem")
    private String tenDem;

    @Column(name = "ho")
    private String ho;

    @Column(name = "ngay_sinh")
    private String ngaySinh;
//    @Column(name = "ngay_sinh")
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
//    private Date ngaySinh;

    @Column(name = "sdt")
    private  String sdt;

    @Column(name = "dia_chi")
    private  String diaChi;

    @Column(name = "thanh_pho")
    private  String thanhPho;

    @Column(name = "quoc_gia")
    private  String quocGia;

    @Column(name = "mat_khau")
    private  String matKhau;
}
