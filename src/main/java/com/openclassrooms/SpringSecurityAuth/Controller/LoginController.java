package com.openclassrooms.SpringSecurityAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/user")
    public String getUser() {
        return "Welcome, User";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Welcome, Admin";
    }

    // mapping for add login with GitHub
    @GetMapping("/")
    public String getGitHub() {
        return "Welcome, GitHub user";
    }

}
