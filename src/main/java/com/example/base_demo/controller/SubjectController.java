package com.example.base_demo.controller;


import com.example.base_demo.pojo.dto.SubjectInfoDTO;
import com.example.base_demo.service.SubjectService;
import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@CrossOrigin
@RestController
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/subjectInfo")
    public JsonResult subjectInfo(@RequestBody SubjectInfoDTO dto){
        return JsonResult.ok(subjectService.justGetSubjectInfo(dto));
    }

}
