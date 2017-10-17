package com.maryanto.dimas.springdi.controller;

import com.maryanto.dimas.springdi.ApplicationKe5;
import com.maryanto.dimas.springdi.repository.TiketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private TiketRepository tiketRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String showIndexHtml(Model model) {
        model.addAttribute("sayHalo", "Halo Dunia");
        model.addAttribute("listTiket", tiketRepository.findAll());
        return "index";
    }

    @GetMapping("/index2")
    public String showIndexHtml2() {
        return "index";
    }

    @GetMapping(value = "/api/tiket/list")
    @ResponseBody
    public List<ApplicationKe5.Tiket> tiketApiFindAll() {
        return tiketRepository.findAll();
    }


}
