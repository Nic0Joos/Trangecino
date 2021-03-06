package com.time.trangecino.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


//added by Luca Weisskopf
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //employee, HR and Admin manually created with username, password and role.
    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("employee1").password(passwordEncoder().encode("employee1Pass")).roles("USER")
                .and()
                .withUser("HR1").password(passwordEncoder().encode("HR2Pass")).roles("USER")
                .and()
                .withUser("admin1").password(passwordEncoder().encode("adminPass")).roles("ADMIN");
    }

    //authorizing requests, redirect to html page
    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests().antMatchers("/").permitAll();

        /*http
                .authorizeRequests()
                    .antMatchers("/", "/Index.html", "/ClockTime.html", "/CreateEmployee.html", "/CreateHR.html", "/CreateWorkschedule.html", "/EditAdmin.html", "/EditEmployee.html", "/EditHR.html", "/EditWorker.html", "/Documentation.html", "/AdminPanel.html", "/HRPanel.html", "/EmployeePanel.html", "/Register.html", "/Login.html", "/Team.html", "/Workschedules.html", "/assets/**", "/api/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/Login.html")
                    .permitAll();*/
                    /*.and()
                .logout()
                    .permitAll()
                    .logoutSuccessUrl("/");
                    Andres Martin ?*/
    }

        /*
         * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
        * All rights reserved.
         */
        //password encoder, in that case the BCryptPassword Encoder
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
}
