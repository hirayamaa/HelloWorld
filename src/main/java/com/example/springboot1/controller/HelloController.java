package com.example.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        // hello.htmlをよぶ
        return "hello";
    }
}
