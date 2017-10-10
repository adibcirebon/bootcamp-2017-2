package com.maryanto.dimas.springdi;

import com.maryanto.dimas.springdi.no.spring.KelasDao;
import com.maryanto.dimas.springdi.spring.KonfigurasiSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDependencyInjectionApplication {

    public static void main(String[] x) {
        ApplicationContext springContainer = new AnnotationConfigApplicationContext(KonfigurasiSpring.class);
        KelasDao ke = springContainer.getBean(KelasDao.class);
        ke.save();

    }
}
