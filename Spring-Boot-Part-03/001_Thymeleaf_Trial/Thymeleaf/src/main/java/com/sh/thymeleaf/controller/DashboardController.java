package com.sh.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {


    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("userName","siyam hossain");
        model.addAttribute("email", "s@gmail.com");
        return "dashboard";
    }
}