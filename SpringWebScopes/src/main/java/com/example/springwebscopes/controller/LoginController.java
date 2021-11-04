package com.example.springwebscopes.controller;

import com.example.springwebscopes.model.LoginProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginCredentials;

    public LoginController(LoginProcessor loginCredentials) {
        this.loginCredentials = loginCredentials;
    }

    @GetMapping("/")
    public String loginGet() {
        return "login";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username,
                            @RequestParam String password,
                            Model page) {
        loginCredentials.setPassword(password);
        loginCredentials.setUsername(username);
        if (loginCredentials.login()) {
            return "redirect:/main";
        }
        page.addAttribute("message", "Login failed!");
        return "login";
    }
}
