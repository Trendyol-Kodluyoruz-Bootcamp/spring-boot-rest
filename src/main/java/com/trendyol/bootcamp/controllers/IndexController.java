package com.trendyol.bootcamp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public RedirectView index() {
        return new RedirectView("swagger-ui.html");
    }
}
