package com.example.demo.controller;
import com.example.demo.model.KhachHang;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<KhachHang> listKhachHang = khachHangService.getAll();
        model.addAttribute("listKhachHang", listKhachHang);
        return "KhachHang/khach-hang";
    }
    @PostMapping("/them")
    public  String them(Model model,
                        @RequestParam("ten") String ten,
                        @RequestParam("ma")String ma,
                        @RequestParam("tenDem") String tenDem,
                        @RequestParam("ho") String ho,
                        @RequestParam("ngaySinh")String ngaySinh,
                        @RequestParam("sdt") String sdt,
                        @RequestParam("diaChi") String diaChi,
                        @RequestParam("thanhPho") String thanhPho,
                        @RequestParam("quocGia") String quocGia,
                        @RequestParam("matKhau") String matKhau){
        KhachHang khachHang = new KhachHang();
        khachHang.setTen(ten);
        khachHang.setMa(ma);
        khachHang.setTenDem(tenDem);
        khachHang.setHo(ho);
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//
//        try {
//            date = formatter.parse(ngaySinh);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        if (date != null) {
//            System.out.println(date.toString());
//        }
//        khachHang.setNgaySinh(date);
        khachHang.setNgaySinh(ngaySinh);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setThanhPho(thanhPho);
        khachHang.setQuocGia(quocGia);
        khachHang.setMatKhau(matKhau);
        khachHangService.them(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }
    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        khachHangService.xoa(id);
        return "redirect:/khach-hang/hien-thi";

    }
    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("khachHang", khachHangService.detail(id));
        System.out.println(id);
        return "KhachHang/detailKH";
    }
    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ten") String ten,
                         @RequestParam("ma")String ma,
                         @RequestParam("tenDem") String tenDem,
                         @RequestParam("ho") String ho,
                         @RequestParam("ngaySinh")String ngaySinh,
                         @RequestParam("sdt") String sdt,
                         @RequestParam("diaChi") String diaChi,
                         @RequestParam("thanhPho") String thanhPho,
                         @RequestParam("quocGia") String quocGia,
                         @RequestParam("matKhau") String matKhau) {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        KhachHang khachHang = new KhachHang();
        khachHang.setTen(ten);
        khachHang.setMa(ma);
        khachHang.setTenDem(tenDem);
        khachHang.setHo(ho);
//        Date ngaySinhx = null;
//        try {
//            ngaySinhx = formatter.parse(ngaySinh);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        khachHang.setNgaySinh(ngaySinhx);
        khachHang.setNgaySinh(ngaySinh);
        khachHang.setSdt(sdt);
        khachHang.setDiaChi(diaChi);
        khachHang.setThanhPho(thanhPho);
        khachHang.setQuocGia(quocGia);
        khachHang.setMatKhau(matKhau);
        System.out.println(id);
        khachHangService.upDate(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }
//@PostMapping("update/{id}")
//public String update(@PathVariable("id") UUID id, @ModelAttribute("khachHang")
//       @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") KhachHang khachHang) {
//    khachHang.setId(id);
//    khachHangService.them(khachHang);
//    return "redirect:/khach-hang/hien-thi";
//}
}
