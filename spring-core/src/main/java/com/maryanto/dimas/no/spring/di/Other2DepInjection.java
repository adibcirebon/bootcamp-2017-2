package com.maryanto.dimas.no.spring.di;

public class Other2DepInjection {

    public Other2DepInjection(String value) {

    }

    OtherDepInjection obj = new OtherDepInjection("valksdjf");

    public void panggil() {
        obj.showValue();
    }
}
