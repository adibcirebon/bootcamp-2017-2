package com.maryanto.dimas.springdi.no.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // untuk membuat bean custome atau yang kita buat sendiri
//@Repository dipake buat interaksi sama database
//@Service dipake buat perhitugan atau jembatan antara repository dan controller
//@Controller untuk membuat url
public class Koneksi {

    private final String url;
    private final String username;
    private final String password;

    ////    construkter inject
    public Koneksi(@Value("getUrl") String x, @Value("getUsername") String username, @Value("bootcamp") String password) {
        this.url = x;
        this.username = username;
        this.password = password;
    }

    public String getKoneksi() {
//        DataSource ds =
        return url + ", " + username + ", " + password;
    }
}
