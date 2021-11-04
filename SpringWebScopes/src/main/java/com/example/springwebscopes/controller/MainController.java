package com.example.springwebscopes.controller;

import com.example.springwebscopes.service.LoggedUserManagementService;
import com.example.springwebscopes.service.LoginCountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;
    private LoginCountService loginCountService;

    public MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }


    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout,
                       Model page) {

        if (logout != null){
           loggedUserManagementService.setUsername(null);
        }
        String username = loggedUserManagementService.getUsername();
        int count = loginCountService.getCount();
        if (username == null) {
            return "redirect:/";
        }
        page.addAttribute("username", username);
        page.addAttribute("count", count);
        return "main";
    }
}
