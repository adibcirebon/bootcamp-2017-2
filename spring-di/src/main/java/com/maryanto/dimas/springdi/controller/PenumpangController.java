package com.maryanto.dimas.springdi.controller;

import com.maryanto.dimas.springdi.ApplicationKe5;
import com.maryanto.dimas.springdi.repository.PenumpangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PenumpangController {

    @Autowired
    private PenumpangRepository penumpangRepository;

    @GetMapping("/penumpang/new")
    public String showFormInput(ApplicationKe5.Penumpang penumpang, Model model) {
        model.addAttribute("penpg", penumpang);
        return "/penumpang/tambahPenumpang";
    }

    @PostMapping("/penumpang/new")
    public String handlerFormInput(ApplicationKe5.Penumpang penumpang) {
        penumpangRepository.save(penumpang);
        return "redirect:/penumpang/new";
    }


}

