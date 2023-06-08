package com.example.demo.controller;
import com.example.demo.model.ChucVu;
import com.example.demo.model.SanPham;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/san-pham")
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<SanPham> listSanPham = sanPhamService.getAll();
        model.addAttribute("listSanPham", listSanPham);
        return "SanPham/san-pham";
    }
    @PostMapping("/them")
    public  String them(Model model,
                        @RequestParam("ten") String ten,
                        @RequestParam("ma")String ma){
        SanPham sanPham = new SanPham();
        sanPham.setMa(ma);
        sanPham.setTen(ten);
        sanPhamService.them(sanPham);
        return "redirect:/san-pham/hien-thi";
    }
    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        sanPhamService.xoa(id);
        return "redirect:/san-pham/hien-thi";

    }
    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("sanPham", sanPhamService.detail(id));
        return "SanPham/detailSP";
    }
    @PostMapping("update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ten") String ten,
                         @RequestParam("ma") String ma) {
        SanPham sanPham = new SanPham();
        sanPham.setId(id);
        sanPham.setMa(ma);
        sanPham.setTen(ten);
        sanPhamService.them(sanPham);
        return "redirect:/san-pham/hien-thi";
    }
}
