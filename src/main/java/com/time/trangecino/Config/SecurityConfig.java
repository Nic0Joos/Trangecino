package com.time.trangecino.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


//Luca Weisskopf
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //employee, HR and Admin manually created with username and password.
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
                .authorizeRequests()
                    .antMatchers("/", "/Index.html", "/css/**", "/js/**", "/images/**, \"/api/**\"").permitAll()
                    .antMatchers("Team.html").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .logout()
                    .permitAll()
                    .logoutSuccessUrl("/");
    }

        //password encoder, in that case the BCryptPassword Encoder
        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
}
