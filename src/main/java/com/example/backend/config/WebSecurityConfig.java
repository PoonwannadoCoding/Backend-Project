package com.example.backend.config;

import com.example.backend.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Lazy
    @Autowired
    private UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.csrf().disable();

        http.authorizeRequests().antMatchers("/","api/login").permitAll();

    }
}
