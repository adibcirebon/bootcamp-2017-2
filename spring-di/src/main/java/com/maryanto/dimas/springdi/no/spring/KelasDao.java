package com.maryanto.dimas.springdi.no.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KelasDao {
    @Autowired
    Koneksi koneksi;

    @Autowired
    InnerKoneksi innerKoneksi;

    public void save() {
        System.out.println(koneksi.getKoneksi());
        System.out.println(innerKoneksi.getSayHalo());
        System.out.println(innerKoneksi.getInnerInInnerKoneksi().getSayHalo());
    }

    public void delete() {
        //lkasjdfkljasdf
    }
}
