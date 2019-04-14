package com.example.base_demo.service;


import com.example.base_demo.pojo.dto.ScoreInfoDTO;
import com.example.base_demo.pojo.vo.StudentScoreVO;

public interface ScoreService {

    Object getOneScore(ScoreInfoDTO dto);
}
