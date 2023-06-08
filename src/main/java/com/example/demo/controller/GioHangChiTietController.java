package com.example.demo.controller;

import com.example.demo.model.ChiTietSanPham;
import com.example.demo.model.GioHang;
import com.example.demo.model.GioHangCT;
import com.example.demo.model.IdGioHangChiTiet;
import com.example.demo.service.ChiTietSanPhamService;
import com.example.demo.service.GioHangCTService;
import com.example.demo.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/gio-hang-chi-tiet")
public class GioHangChiTietController {

    @Autowired
    private GioHangCTService gioHangCTService;

    @Autowired
    private GioHangService gioHangService;

    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping("/hienthi")
    public String hienThi(Model model){
        ArrayList<GioHangCT> listGHCT = gioHangCTService.getAll();
        model.addAttribute("listGHCT", listGHCT);
        model.addAttribute("listgh", gioHangService.getAll());
        model.addAttribute("listChiTietSp", chiTietSanPhamService.getAll());
        return "/GHCT/ghct";
    }
    @RequestMapping("/xoa")
    public String delete(@RequestParam("idgh") UUID idgh ,
                         @RequestParam("idctsp") UUID idctsp){
        GioHang gioHang = new GioHang();
        gioHang.setId(idgh);
        ChiTietSanPham chiTietSanPham= new ChiTietSanPham();
        chiTietSanPham.setId(idctsp);
        gioHangCTService.delete(idgh,idctsp);
        return "redirect:/gio-hang-chi-tiet/hienthi";
    }
    @PostMapping("/them")
    public String them(GioHangCT gioHangCT){
        gioHangCTService.add(gioHangCT);
        return "redirect:/gio-hang-chi-tiet/hienthi";
    }
    @GetMapping("/detail")
    public String detail( Model model,
                          @RequestParam("idgh") UUID idgh ,
                          @RequestParam("idctsp") UUID idctsp){
        GioHang gioHang = new GioHang();
        gioHang.setId(idgh);
        ChiTietSanPham chiTietSanPham= new ChiTietSanPham();
        chiTietSanPham.setId(idctsp);
        model.addAttribute("listGHCT", gioHangService.getAll());
        model.addAttribute("listChiTietSp",chiTietSanPhamService.getAll());
        model.addAttribute("ghct",chiTietSanPhamService.detail(idgh,idctsp));
        return "/GHCT/detailGHCT";
    }
    @PostMapping("/update")
    public String update(@RequestParam("idhd") UUID idhd ,
                         @RequestParam("idctsp") UUID idctsp,
                         GioHangCT gioHangCT){
        GioHang gioHang = new GioHang();
        gioHang.setId(idhd);
        ChiTietSanPham chiTietSanPham= new ChiTietSanPham();
        chiTietSanPham.setId(idctsp);
        IdGioHangChiTiet idhdct = new IdGioHangChiTiet(gioHang,chiTietSanPham);
        gioHangCT.setId(idhdct);
        gioHangCTService.add(gioHangCT);

        return "redirect:/hoadonchitiet/hienthi";
    }
}
