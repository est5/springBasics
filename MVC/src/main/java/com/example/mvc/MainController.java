package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    // Query parameters
    /*@RequestMapping("/home")
    public String home(@RequestParam String color, @RequestParam String name, Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home";
    }*/
    // Path parameters
   /* @RequestMapping("/home/{color}")
    public String home(@PathVariable String color, Model page) {
        page.addAttribute("username", "Name");
        page.addAttribute("color", color);
        return "home";
    }*/



}
