package com.maryanto.dimas.springdi.no.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InnerKoneksi {

    @Autowired
    private InnerInInnerKoneksi innerInInnerKoneksi;

    public InnerInInnerKoneksi getInnerInInnerKoneksi() {
        return innerInInnerKoneksi;
    }

    @Value("Halo ini dari innerKoneksi")
    private String sayHalo;

    public String getSayHalo() {
        return sayHalo;
    }
}
