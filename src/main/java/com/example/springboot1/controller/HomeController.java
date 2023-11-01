package com.example.springboot1.controller;

import com.example.springboot1.model.Inquiry;
import com.example.springboot1.model.Invoice;
import com.example.springboot1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }

    @PostMapping("/form")
    private String confirm(@ModelAttribute User user) {
        return "confirm";
    }

    @GetMapping("/index")
    private String index(@ModelAttribute Inquiry inquiry) {
        return "index";
    }

    @PostMapping("/index")
    private String confirm(@Validated @ModelAttribute Inquiry inquiry, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // エラーがある場合、index.htmlに戻る
            return "index";
        }
        return "inquiry_confirm";
    }

    @GetMapping("/invoice")
    private String invoice(@ModelAttribute Invoice invoice) {
        return "invoice";
    }

    @PostMapping("/invoice")
    private String confirmInvoice(@Validated @ModelAttribute Invoice invoice, BindingResult result) {
        if (result.hasErrors()) {
            return "invoice";
        }
        return "invoice_confirm";
    }
}
