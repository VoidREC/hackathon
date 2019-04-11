package com.example.base_demo.controller;

import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class FilmController {

    @GetMapping("/film")
    public JsonResult film(@RequestParam )
}
