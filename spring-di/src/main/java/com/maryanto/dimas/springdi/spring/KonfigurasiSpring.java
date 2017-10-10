package com.maryanto.dimas.springdi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.maryanto.dimas.springdi.no.spring")
public class KonfigurasiSpring {

    @Bean
    public String getUrl(){
        return "jdbc:postgresql://localhost:5432/bootcamp_2";
    }

    @Bean
    public String getUsername(){
        return "bootcamp_2";
    }

    @Bean
    public String getPassword(){
        return "jdbc:postgresql://localhost:5432/bootcamp_2";
    }



}
