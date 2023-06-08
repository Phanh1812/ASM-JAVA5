package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.model.DongSP;
import com.example.demo.repository.ChucVuRepository;
import com.example.demo.repository.DongSPRepository;
import com.example.demo.service.ChucVuService;
import com.example.demo.service.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/chuc-vu")
public class ChucVuController {
    @Autowired
    private ChucVuRepository chucVuRepository;

    @Autowired
    private ChucVuService chucVuService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<ChucVu> listChucVu = chucVuService.getAll();
        model.addAttribute("listChucVu", listChucVu);
        return "ChucVu/chuc-vu";
    }
    @PostMapping("/them")
    public  String them(Model model,
                        @RequestParam("ten") String ten,
                        @RequestParam("ma")String ma){
        ChucVu chucVu = new ChucVu();
        chucVu.setMa(ma);
        chucVu.setTen(ten);
        chucVuService.them(chucVu);
        return "redirect:/chuc-vu/hien-thi";
    }
    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        chucVuService.xoa(id);
        return "redirect:/chuc-vu/hien-thi";

    }
    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("chucVu", chucVuService.detail(id));
        return "ChucVu/detail";
    }
    @PostMapping("update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ten") String ten,
                         @RequestParam("ma") String ma) {
        ChucVu chucVu = new ChucVu();
        chucVu.setMa(ma);
        chucVu.setTen(ten);
        chucVuService.them(chucVu);
        return "redirect:/chuc-vu/hien-thi";
    }
}
