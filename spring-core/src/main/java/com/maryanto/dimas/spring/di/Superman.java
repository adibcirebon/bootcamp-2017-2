package com.maryanto.dimas.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Superman {

    @Autowired
    public Superman(@Value("false") Boolean x, @Value("true") Boolean y, OtherBean xy) {

        this.terbang = x;
        this.nembak = y;
        this.otherBean = xy;
    }

    @Value("false")
    public Boolean terbang;
    @Value("true")
    public Boolean nembak;
    private OtherBean otherBean;

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public Boolean getTerbang() {
        return terbang;
    }

    //    setter injection
    public void setTerbang(Boolean terbang) {
        this.terbang = terbang;
    }

    public Boolean getNembak() {
        return nembak;
    }

    public void setNembak(Boolean nembak) {
        this.nembak = nembak;
    }
}
