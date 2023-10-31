package com.example.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        // hello.htmlをよぶ
        return "hello";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(required = false) String message, Model model) {
        model.addAttribute("sample", message);
        return "hello";
    }

    @PostMapping("/confirm")
    public String confirm(@RequestParam String message, Model model) {
        model.addAttribute("message", message);
        return "confirm";
    }
}
