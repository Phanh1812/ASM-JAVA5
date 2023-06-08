package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.model.MauSac;
import com.example.demo.model.SanPham;
import com.example.demo.service.MauSacService;
import com.example.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/mau-sac")
public class MauSacController {
    @Autowired
    private MauSacService mauSacService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<MauSac> listMauSac = mauSacService.getAll();
        model.addAttribute("listMauSac", listMauSac);
        return "MauSac/mau-sac";
    }
    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ten") String ten,
                       @RequestParam("ma") String ma) {
        MauSac mauSac = new MauSac();
        mauSac.setMa(ma);
        mauSac.setTen(ten);
        mauSacService.them(mauSac);
        return "redirect:/mau-sac/hien-thi";
    }

    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        mauSacService.xoa(id);
        return "redirect:/mau-sac/hien-thi";

    }
    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("mauSac", mauSacService.detail(id));
        return "MauSac/detailMS";
    }
    @PostMapping("update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ten") String ten,
                         @RequestParam("ma") String ma) {
        MauSac mauSac = new MauSac();
        mauSac.setId(id);
        mauSac.setMa(ma);
        mauSac.setTen(ten);
        mauSacService.them(mauSac);
        return "redirect:/mau-sac/hien-thi";
    }
}
