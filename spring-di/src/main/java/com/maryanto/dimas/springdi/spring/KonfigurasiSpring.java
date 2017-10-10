package com.maryanto.dimas.springdi.spring;

import com.maryanto.dimas.springdi.no.spring.KelasDao;
import com.maryanto.dimas.springdi.no.spring.Koneksi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KonfigurasiSpring {

    @Value("jdbc")
    public String url;
    @Value("user")
    public String username;
    @Value("pasword")
    public String password;

    @Bean
    public Koneksi getKoneksi() {
        return new Koneksi(url, username, password);
    }

    @Bean
    public KelasDao getKelasDao(Koneksi koneksi) {
        return new KelasDao(koneksi);
    }
}
