package com.maryanto.dimas.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] x) {
        ApplicationContext springContect = SpringApplication.run(Application.class, x);
        UmurSaya bean = springContect.getBean(UmurSaya.class);
        System.out.println(bean.umurSaya());
    }

    //    @Bean
    public Integer umur() {
        return 20;
    }

    //    @Bean(name = "umurKe25")
    public Integer umur25() {
        return 25;
    }

    //    @Component
    public class UmurSaya {

        @Autowired
        @Qualifier("umurKe25")
        private Integer umur;

        public String umurSaya() {
            return "Umur saya " + umur + " tahun";
        }
    }
}
