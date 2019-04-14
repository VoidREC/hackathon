package com.example.base_demo.controller;


import com.example.base_demo.service.SubjectService;
import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping(value = "/subjectInfo/{id}")
    public JsonResult subjectInfo(@PathParam("id")Integer id){
        return JsonResult.ok(subjectService.getInfo(id));
    }
}
