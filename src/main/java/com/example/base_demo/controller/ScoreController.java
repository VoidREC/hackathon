package com.example.base_demo.controller;

import com.example.base_demo.pojo.dto.ScoreInfoDTO;
import com.example.base_demo.service.ScoreService;
import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping("/getOneScore")
    public JsonResult getOneScore(@RequestParam(value = "uid") String uid,
                                  @RequestParam(value = "term") Integer term){
        ScoreInfoDTO dto = new ScoreInfoDTO();
        dto.setTerm(term);
        dto.setUid(uid);
        return JsonResult.ok(scoreService.getOneScore(dto));
    }
}
