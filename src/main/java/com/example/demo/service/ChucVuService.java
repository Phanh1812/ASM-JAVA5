package com.example.demo.service;

import com.example.demo.model.ChucVu;
import com.example.demo.service.impl.ChucVuServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public interface ChucVuService {
 ChucVu them(ChucVu chucVu) ;

 public void xoa(UUID id);

 ChucVu detail(UUID id);

 void upDate(ChucVu chucVu);

 public ArrayList<ChucVu> getAll();
}
