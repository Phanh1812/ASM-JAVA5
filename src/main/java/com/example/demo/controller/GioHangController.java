package com.example.demo.controller;

import com.example.demo.model.ChiTietSanPham;
import com.example.demo.model.GioHang;
import com.example.demo.service.GioHangService;
import com.example.demo.service.KhachHangService;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/gio-hang")
public class GioHangController {
    @Autowired
    private GioHangService gioHangService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<GioHang> listGH = gioHangService.getAll();
        model.addAttribute("listGH", listGH);
        model.addAttribute("khachHang", khachHangService.getAll());
        model.addAttribute("nhanVien", nhanVienService.getAll());
        return "GioHang/gio-hang";
    }
    @PostMapping("/them")
    public String them(Model model,
                       @ModelAttribute GioHang gioHang) {
        gioHangService.them(gioHang);
        return "redirect:/gio-hang/hien-thi";
    }

    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        gioHangService.xoa(id);
        return "redirect:/gio-hang/hien-thi";

    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        GioHang gioHang = gioHangService.detail(id);
        model.addAttribute("gioHang", gioHangService);
        model.addAttribute("khachHang", khachHangService.getAll());
        model.addAttribute("nhanVien", nhanVienService.getAll());
        return "NhanVien/detailNV";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") UUID id,
                         @ModelAttribute GioHang gioHang) {
        gioHang.setId(id);
        gioHangService.them(gioHang);
        return "redirect:/gio-hang/hien-thi";
    }
}
