package com.maryanto.dimas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {

    @GetMapping("/new")
    public String newMahasiswa() {
        return "/mahasiswa/TambahMahasiswa";
    }

}
