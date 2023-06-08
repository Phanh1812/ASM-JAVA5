package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.model.NhanVien;
import com.example.demo.repository.NhanVienRepository;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<NhanVien> listNhanVien = nhanVienService.getAll();
        model.addAttribute("listNhanVien", listNhanVien);
        return "NhanVien/nhan-vien";
    }
    @PostMapping("/them")
    public  String them(Model model,
                        @RequestParam("ma") String ma,
                        @RequestParam("ten")String ten,
                        @RequestParam("tenDem") String tenDem,
                        @RequestParam("ho") String ho,
                        @RequestParam("gioiTinh") String gioiTinh,
                        @RequestParam("ngaySinh") String ngaySinh,
                        @RequestParam("diaChi") String diaChi,
                        @RequestParam("sdt") String sdt,
                        @RequestParam("matKhau") String matKhau){
        NhanVien nhanVien = new NhanVien();
        nhanVien.setMa(ma);
        nhanVien.setTen(ten);
        nhanVien.setTenDem(tenDem);
        nhanVien.setHo(ho);
        nhanVien.setGioiTinh(gioiTinh);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        try {
            date = formatter.parse(ngaySinh);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (date != null) {
            System.out.println(date.toString());
        }
        nhanVien.setNgaySinh(date);
        nhanVien.setDiaChi(diaChi);
        nhanVien.setSdt(sdt);
        nhanVien.setMatKhau(matKhau);
        nhanVienService.them(nhanVien);
        return "redirect:/nhan-vien/hien-thi";
    }
    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        nhanVienService.xoa(id);
        return "redirect:/nhan-vien/hien-thi";

    }
    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("nhanVien", nhanVienService.detail(id));
        return "NhanVien/detailNV";
    }
    @PostMapping("update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ma") String ma,
                         @RequestParam("ten")String ten,
                         @RequestParam("tenDem") String tenDem,
                         @RequestParam("ho") String ho,
                         @RequestParam("gioiTinh") String gioiTinh,
                         @RequestParam("ngaySinh") Date ngaySinh,
                         @RequestParam("diaChi") String diaChi,
                         @RequestParam("sdt") String sdt,
                         @RequestParam("matKhau") String matKhau) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setId(id);
        nhanVien.setMa(ma);
        nhanVien.setTen(ten);
        nhanVien.setTenDem(tenDem);
        nhanVien.setHo(ho);
        nhanVien.setGioiTinh(gioiTinh);
        nhanVien.setNgaySinh(ngaySinh);
        nhanVien.setDiaChi(diaChi);
        nhanVien.setSdt(sdt);
        nhanVien.setMatKhau(matKhau);
        nhanVienService.them(nhanVien);
        return "redirect:/nhan-vien/hien-thi";
    }

}
