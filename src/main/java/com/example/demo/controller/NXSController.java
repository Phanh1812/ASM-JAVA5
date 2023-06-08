package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.model.DongSP;
import com.example.demo.model.NXS;
import com.example.demo.service.DongSPService;
import com.example.demo.service.NXSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@Controller
@RequestMapping("/nxs")
public class NXSController {
    @Autowired
    private NXSService nxsService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        ArrayList<NXS> listNXS = nxsService.getAll();
        model.addAttribute("listNXS", listNXS);
        return "NXS/nxs";
    }

    @PostMapping("/them")
    public String them(Model model,
                       @RequestParam("ten") String ten,
                       @RequestParam("ma") String ma) {
        NXS nsx = new NXS();
        nsx.setMa(ma);
        nsx.setTen(ten);
        nxsService.them(nsx);
        return "redirect:/nxs/hien-thi";
    }

    @RequestMapping("/xoa")
    public String xoa(Model model, @RequestParam("id") UUID id) {
        nxsService.xoa(id);
        return "redirect:/nxs/hien-thi";

    }
    @GetMapping("detail/{id}")
    public String detail(@PathVariable("id") UUID id,
                         Model model) {
        model.addAttribute("nxs", nxsService.detail(id));
        return "NXS/detailNSX";
    }
    @PostMapping("update/{id}")
    public String update(Model model,
                         @PathVariable("id") UUID id,
                         @RequestParam("ten") String ten,
                         @RequestParam("ma") String ma) {
        NXS nsx = new NXS();
        nsx.setId(id);
        nsx.setMa(ma);
        nsx.setTen(ten);
        nxsService.them(nsx);
        return "redirect:/nxs/hien-thi";
    }
}
