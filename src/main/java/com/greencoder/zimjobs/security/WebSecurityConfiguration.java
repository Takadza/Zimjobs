package com.greencoder.zimjobs.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    /**
     * This method contains the login detailes wich will be used to login to the system
     * it is a build in spring security that aims to makes sure that all the people who are accessing
     * the system are authorized to
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("tk@greencoder.com")
                .password("pass123")
                .roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("login").permitAll()
                .anyRequest().hasRole("USER").and()
                .formLogin()
                .loginPage("/login")
                .permitAll().and().logout()
                .logoutUrl("/login")
                .permitAll();




    }
}
