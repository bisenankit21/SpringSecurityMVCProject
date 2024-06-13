package com.ankit.springboot.SpringSecurityMVCProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
       // return "plain-login";
        return "fancy-login";
    }

    // add request mapping for  access denied page
    @GetMapping("/access-denied")
    public String showAccessDeniedPage(){
        // return "plain-login";
        return "access-denied";
    }

}
