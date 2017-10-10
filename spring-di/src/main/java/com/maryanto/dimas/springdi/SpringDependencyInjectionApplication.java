package com.maryanto.dimas.springdi;

import com.maryanto.dimas.springdi.no.spring.InnerKoneksi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] x) {
        ApplicationContext springContext = SpringApplication.run(SpringDependencyInjectionApplication.class, x);
        InnerKoneksi innerKoneksi = springContext.getBean("innerKoneksi", InnerKoneksi.class);
        System.out.println(innerKoneksi.getSayHalo());
    }
}
