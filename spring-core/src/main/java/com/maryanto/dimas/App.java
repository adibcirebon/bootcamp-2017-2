package com.maryanto.dimas;

import com.maryanto.dimas.spring.di.BukuDao;
import com.maryanto.dimas.spring.di.SpringIOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws SQLException {
        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringIOC.class);
        BukuDao bukuDao = springContext.getBean(BukuDao.class);
        bukuDao.saveBuku("Java", "Dimas", 10);
        bukuDao.updateBuku("Java Updated v 2", 9);
    }
}
