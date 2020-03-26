package com.learningspree.LearningSpreeApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AuthController {
    @GetMapping("/secured")
    public String securedPage(){
        return "hello";
    }

    @GetMapping("/login/oauth2/code/okta")
    public String callback(HttpServletRequest request){
        return "hello";
    }
}
