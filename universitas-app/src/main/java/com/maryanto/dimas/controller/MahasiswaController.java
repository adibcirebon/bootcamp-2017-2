package com.maryanto.dimas.controller;

import com.maryanto.dimas.model.User;
import com.maryanto.dimas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/new")
    public String newMahasiswa(Authentication auth) {
//        username
        User userLogin = userRepository.findByUsername(auth.getName());
//        didalem username itu ada role apa saja?
        auth.getAuthorities();

        return "/mahasiswa/TambahMahasiswa";
    }

}
