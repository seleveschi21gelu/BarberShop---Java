//package com.barbershop.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//@Order
//public class ApiSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
////        http.authorizeRequests().antMatchers("/api/**").hasAnyRole("USER");
//        http.cors();
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/api/register").permitAll();
//        http.authorizeRequests().antMatchers("/api/**").authenticated();
//        http.antMatcher("/api/**").httpBasic();
//    }
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(this.dataSource)
//                .passwordEncoder(passwordEncoder);
//        System.out.println(passwordEncoder.encode("password"));
//    }
//}
