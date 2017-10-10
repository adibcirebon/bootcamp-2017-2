package com.maryanto.dimas.spring.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanInnerBean implements ApplicationContextAware {
    private String nama;
    private ApplicationContext applicationContext;

    public String getNama() {
        nama = applicationContext.getBean("sayHalo", String.class);
        return nama;
    }


    public void setNama(String nama) {

        this.nama = nama;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
