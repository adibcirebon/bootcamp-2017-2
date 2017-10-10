package com.maryanto.dimas.springdi.no.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InnerInInnerKoneksi {

    @Value("Ini dari innnerInInnerKoneksi")
    private String sayHalo;

    public String getSayHalo() {
        return sayHalo;
    }
}
