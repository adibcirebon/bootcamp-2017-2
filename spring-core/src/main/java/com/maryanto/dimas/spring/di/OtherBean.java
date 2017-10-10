package com.maryanto.dimas.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OtherBean {

    @Autowired
    private OtherBeanInnerBean otherBean;

    @Value("Dimas Maryanto")
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public OtherBeanInnerBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBeanInnerBean otherBean) {
        this.otherBean = otherBean;
    }
}
