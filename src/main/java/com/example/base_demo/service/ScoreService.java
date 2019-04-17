package com.example.base_demo.service;


import com.example.base_demo.pojo.dto.ScoreInfoDTO;
import com.example.base_demo.pojo.vo.OneScoreVO;
import com.example.base_demo.pojo.vo.OneStudentScoreVO;
import com.example.base_demo.pojo.vo.StudentScoreVO;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface ScoreService {

    Object getOneScore(ScoreInfoDTO dto);

    List<OneScoreVO> getAllScore(Integer term,Integer classNumber);
}
