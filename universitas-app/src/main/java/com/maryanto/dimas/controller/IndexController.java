package com.maryanto.dimas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/home")
    public String indexHtml() {
        return "/index";
    }

    @GetMapping("/login-form")
    public String showFormLogin() {
        return "/login";
    }
}
