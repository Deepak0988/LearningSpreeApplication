package com.learningspree.LearningSpreeApplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login/oauth2/code/okta").permitAll()
                .anyRequest().fullyAuthenticated()
                .and()
                .oauth2Login();
    }
}
