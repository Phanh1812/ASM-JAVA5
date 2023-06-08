package com.example.demo.controller;


import com.example.demo.model.DongSP;
import com.example.demo.repository.DongSPRepository;
import com.example.demo.service.DongSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/dong-sp")
public class DongSPController {

    @Autowired
    private DongSPRepository dongSPRepository;

    @Autowired
    private DongSPService dongSPService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<DongSP> listDongSP = dongSPService.getAll();
        model.addAttribute("listDongSP", listDongSP);
        return "DongSP/dong-sp";
    }
    @PostMapping("/them")
    public  String them(Model model,
                        @RequestParam("ten") String ten,
                        @RequestParam("ma")String ma){
        DongSP dongSP = new DongSP();
        dongSP.setMa(ma);
        dongSP.setTen(ten);
        dongSPService.them(dongSP);
        return "redirect:/dong-sp/hien-thi";
    }
    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        dongSPService.xoa(id);
        return "redirect:/dong-sp/hien-thi";

    }
    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("dongSP", dongSPService.detail(id));
        return "DongSP/detailDSP";
    }
    @PostMapping("update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ten") String ten,
                         @RequestParam("ma") String ma) {
        DongSP dongSP = new DongSP();
        dongSP.setId(id);
        dongSP.setMa(ma);
        dongSP.setTen(ten);
        dongSPService.them(dongSP);
        return "redirect:/dong-sp/hien-thi";
    }
}
