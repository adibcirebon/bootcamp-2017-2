package com.maryanto.dimas.springdi;

import com.maryanto.dimas.springdi.spring.KonfigurasiSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDependencyInjectionApplication {

    public static void main(String[] x) {
        ApplicationContext springContainer = new AnnotationConfigApplicationContext(KonfigurasiSpring.class);

        String seqUUID = springContainer.getBean(String.class);
//        String seqUUID = UUID.randomUUID().toString();
        System.out.println(seqUUID);

        seqUUID = springContainer.getBean(String.class);
//        seqUUID = UUID.randomUUID().toString();
        System.out.println(seqUUID);

        seqUUID = springContainer.getBean(String.class);
//        seqUUID = UUID.randomUUID().toString();
        System.out.println(seqUUID);

    }
}
