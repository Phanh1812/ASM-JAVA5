package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/chi-tiet-san-pham")
public class ChiTietSanPhamController {
    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;
    @Autowired
    private SanPhamService sanPhamService;
    @Autowired
    private NXSService nxsService;
    @Autowired
    private MauSacService mauSacService;
    @Autowired
    private DongSPService dongSPService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<ChiTietSanPham> listCTSP = chiTietSanPhamService.getAll();
        model.addAttribute("listCTSP", listCTSP);
        model.addAttribute("sanPham", sanPhamService.getAll());
        model.addAttribute("nxs", nxsService.getAll());
        model.addAttribute("mauSac", mauSacService.getAll());
        model.addAttribute("dongSP", dongSPService.getAll());
        return "CTSP/ctsp";
    }
    @PostMapping("/them")
    public String them(Model model,
                       @ModelAttribute ChiTietSanPham chiTietSanPham) {
        chiTietSanPhamService.them(chiTietSanPham);
        return "redirect:/chi-tiet-san-pham/hien-thi";
    }
//    @PostMapping("/them")
//    public  String them(Model model,
//                        @RequestParam("id_sp") SanPham sanPham ,
//                        @RequestParam("id_nsx") NXS nxs,
//                        @RequestParam("id_mau_sac") MauSac mauSac,
//                        @RequestParam("id_dong_sp") DongSP dongSP,
//                        @RequestParam("namBH") Integer namBH,
//                        @RequestParam("moTa")String moTa,
//                        @RequestParam("soluongTon")Integer soluongTon,
//                        @RequestParam("giaNhap") Double giaNhap,
//                        @RequestParam("giaBan") Double giaBan)
//    {
//        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
//        chiTietSanPham.setSanPham(sanPham);
//        chiTietSanPham.setNxs(nxs);
//        chiTietSanPham.setMauSac(mauSac);
//        chiTietSanPham.setDongSP(dongSP);
//        chiTietSanPham.setNamBH(namBH);
//        chiTietSanPham.setMoTa(moTa);
//        chiTietSanPham.setSoluongTon(soluongTon);
//        chiTietSanPham.setGiaNhap(giaNhap);
//        chiTietSanPham.setGiaBan(giaBan);
//        chiTietSanPhamService.them(chiTietSanPham);
//        return "redirect:/chi-tiet-san-pham/hien-thi";
//    }
    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        chiTietSanPhamService.xoa(id);
        return "redirect:/chi-tiet-san-pham/hien-thi";

    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        ChiTietSanPham chiTietSanPham = chiTietSanPhamService.detail(id);
        model.addAttribute("ctsp", chiTietSanPham);
        model.addAttribute("sanPham", sanPhamService.getAll());
        model.addAttribute("nxs", nxsService.getAll());
        model.addAttribute("mauSac", mauSacService.getAll());
        model.addAttribute("dongSP", dongSPService.getAll());
        return "CTSP/detailCTSP";
    }
//    @GetMapping("detail/{id}")
//    public String detail(@PathVariable("id") UUID id,
//                         Model model) {
//        model.addAttribute("ctsp", chiTietSanPhamService.detail(id));
//        return "CTSP/detailCTSP";
//    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") UUID id,
                         @ModelAttribute ChiTietSanPham chiTietSanPham) {
        chiTietSanPham.setId(id);
        chiTietSanPhamService.them(chiTietSanPham);
        return "redirect:/chi-tiet-san-pham/hien-thi";
    }
//    @PostMapping("update/{id}")
//    public String update(Model model,
//                         @PathVariable("id") UUID id,
//                         @RequestParam("namBH") Integer namBH,
//                         @RequestParam("moTa")String moTa,
//                         @RequestParam("soluongTon")Integer soluongTon,
//                         @RequestParam("giaNhap") Double giaNhap,
//                         @RequestParam("giaBan") Double giaBan) {
//        ChiTietSanPham chiTietSanPham = new ChiTietSanPham();
//        chiTietSanPham.setId(id);
//        chiTietSanPham.setNamBH(namBH);
//        chiTietSanPham.setMoTa(moTa);
//        chiTietSanPham.setSoluongTon(soluongTon);
//        chiTietSanPham.setGiaNhap(giaNhap);
//        chiTietSanPham.setGiaBan(giaBan);
//        chiTietSanPhamService.them(chiTietSanPham);
//        return "redirect:/chi-tiet-san-pham/hien-thi";
//    }

}
