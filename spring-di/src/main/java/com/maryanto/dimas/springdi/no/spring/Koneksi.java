package com.maryanto.dimas.springdi.no.spring;

public class Koneksi {

    private final String url;
    private final String username;
    private final String password;

//    construkter inject
    public Koneksi(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getKoneksi() {
//        DataSource ds =
        return url + ", " + username + ", " + password;
    }
}
