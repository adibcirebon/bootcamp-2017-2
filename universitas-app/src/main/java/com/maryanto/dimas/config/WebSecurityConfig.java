package com.maryanto.dimas.config;

import com.maryanto.dimas.services.UserServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
//        super.configure(web);
        web.debug(true);
    }

//    @Bean
//    @Autowired
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(
//                User.withUsername("user").password(passwordEncoder.encode("user123"))
//                        .roles("USER").roles("OPERATOR").build());
//        return manager;
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/mahasiswa/new").hasRole("OPERATOR")
                .antMatchers("/daftar/new").access("hasRole('ADMIN') or hasRole('OPERATOR')")
                .anyRequest().authenticated()
                .and().formLogin().defaultSuccessUrl("/home").permitAll()
                .and().logout().logoutSuccessUrl("/home").permitAll();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(
            UserServices userServices,
            PasswordEncoder passwordEncoder) {
        DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
        dao.setUserDetailsService(userServices);
        dao.setPasswordEncoder(passwordEncoder);
        return dao;
    }
}
