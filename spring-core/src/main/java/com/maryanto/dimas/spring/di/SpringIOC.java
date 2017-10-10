package com.maryanto.dimas.spring.di;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
@ComponentScan(basePackages = "com.maryanto.dimas.spring.di")
public class SpringIOC {

    @Value("jdbc:postgresql://localhost:5432/bootcamp_2")
    private String url;

    @Value("bootcamp_2")
    private String username;

    @Value("bootcamp")
    private String password;

    @Bean
    public String sayHalo() {
        return new String("Halo ini dari Spring IOC java Config");
    }

    @Bean
    public DataSource getDataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(this.url);
        basicDataSource.setPassword(this.password);
        basicDataSource.setUsername(this.username);
        return basicDataSource;
    }

    @Bean
    @Autowired
    public Connection getConnection(DataSource dataSource) {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
