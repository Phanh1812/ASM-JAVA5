package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.model.CuaHang;
import com.example.demo.model.NhanVien;
import com.example.demo.repository.CuaHangRepository;
import com.example.demo.service.CuaHangService;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {

    ArrayList<CuaHang> listCuaHang = new ArrayList<>();

    @Autowired
    private CuaHangRepository cuaHangRepository;

    @Autowired
    private CuaHangService cuaHangService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<CuaHang> listCuaHang = cuaHangService.getAll();
        model.addAttribute("listCuaHang", listCuaHang);
        return "CuaHang/cua-hang";
    }

    @PostMapping("/them")
    public  String them(Model model,
                        @RequestParam("ma") String ma,
                        @RequestParam("ten") String ten,
                        @RequestParam("diaChi") String diaChi,
                        @RequestParam("thanhPho") String thanhPho,
                        @RequestParam("quocGia") String quocGia){
        CuaHang cuaHang = new CuaHang();
        cuaHang.setMa(ma);
        cuaHang.setTen(ten);
        cuaHang.setDiaChi(diaChi);
        cuaHang.setThanhPho(thanhPho);
        cuaHang.setQuocGia(quocGia);
        cuaHangService.them(cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }

    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        cuaHangService.xoa(id);
        return "redirect:/cua-hang/hien-thi";

    }

    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("cuaHang", cuaHangService.detail(id));
        return "CuaHang/detailCH";
    }

    @PostMapping("update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ma") String ma,
                         @RequestParam("ten") String ten,
                         @RequestParam("diaChi") String diaChi,
                         @RequestParam("thanhPho") String thanhPho,
                         @RequestParam("quocGia") String quocGia) {
        CuaHang cuaHang = new CuaHang();
        cuaHang.setId(id);
        cuaHang.setMa(ma);
        cuaHang.setTen(ten);
        cuaHang.setDiaChi(diaChi);
        cuaHang.setThanhPho(thanhPho);
        cuaHang.setQuocGia(quocGia);
        cuaHangService.them(cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }
}
