package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "hoa_don_chi_tiet")
@Entity
@Data
public class HoaDonChiTiet {
    @EmbeddedId
    private IdHoaDonChiTiet id;

//    @ManyToOne
//    @JoinColumn(name = "id_chi_tiet_sp")
//    private ChiTietSanPham chiTietSanPham;
//
//    @ManyToOne
//    @JoinColumn(name = "id_hoa_don")
//    private HoaDon hoaDon;

    private Integer soLuong;

    private Long donGia;

    @Override
    public String toString() {
        return
                "Ma Hoa Don=" + id.getHoaDon().getMa() +
                        ", soLuong=" + soLuong +
                        ", donGia=" + donGia +
                        "Chi Tiet san Pham: " + id.getChiTietSanPham().getId();
    }
}
