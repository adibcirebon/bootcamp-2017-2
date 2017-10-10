package com.maryanto.dimas.springdi.no.spring;

public class KelasDao {
    Koneksi koneksi;

    public KelasDao(Koneksi koneksi) {
        this.koneksi = koneksi;
    }

    public KelasDao() {
    }

//    setter injection
    public void setKoneksi(Koneksi koneksi) {
        this.koneksi = koneksi;
    }

    public void save() {
        System.out.println(koneksi.getKoneksi());
    }

    public void delete(){
        //lkasjdfkljasdf
    }
}
