package com.example.base_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TemplateController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
