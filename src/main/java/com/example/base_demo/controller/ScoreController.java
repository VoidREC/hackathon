package com.example.base_demo.controller;

import com.example.base_demo.pojo.dto.ScoreInfoDTO;
import com.example.base_demo.service.ScoreService;
import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PostMapping("/getOneScore")
    public JsonResult getOneScore(@RequestBody ScoreInfoDTO dto){

        return JsonResult.ok(scoreService.getOneScore(dto));
    }
}
