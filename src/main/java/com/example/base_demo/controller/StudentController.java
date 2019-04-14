package com.example.base_demo.controller;


import com.example.base_demo.pojo.dto.UserloginDTO;
import com.example.base_demo.pojo.entity.Student;
import com.example.base_demo.service.StudentService;
import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/studentLogin")
    public JsonResult studentLogin(@RequestBody UserloginDTO dto){
        return JsonResult.ok(studentService.studentLogin(dto));
    }

    @PostMapping("/monitorLogin")
    public JsonResult monitorLogin(@RequestBody UserloginDTO dto){
        return JsonResult.ok(studentService.monitorLogin(dto));
    }

}
