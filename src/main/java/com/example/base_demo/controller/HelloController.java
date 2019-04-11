package com.example.base_demo.controller;


import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public JsonResult sayHello(){
        return JsonResult.ok("hello");
    }
}
