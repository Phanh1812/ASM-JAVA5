package com.example.demo.controller;

import com.example.demo.model.DongSP;
import com.example.demo.model.HoaDon;
import com.example.demo.service.DongSPService;
import com.example.demo.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/hoa-don")
public class HoaDonController {
    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<HoaDon> listHoaDon = hoaDonService.getAll();
        model.addAttribute("listHoaDon", listHoaDon);
        return "HoaDon/hoa-don";
    }

}
