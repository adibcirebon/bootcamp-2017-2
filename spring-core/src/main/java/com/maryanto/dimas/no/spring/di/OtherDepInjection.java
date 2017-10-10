package com.maryanto.dimas.no.spring.di;

public class OtherDepInjection {

    public OtherDepInjection(String value){

    }

    Other2DepInjection obj = new Other2DepInjection("value");

    public void showValue(){
        obj.toString();
    }
}
