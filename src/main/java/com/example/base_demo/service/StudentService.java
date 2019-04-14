package com.example.base_demo.service;

import com.example.base_demo.pojo.dto.UserloginDTO;
import com.example.base_demo.pojo.vo.StudentInfoVO;
import com.example.base_demo.pojo.vo.StudentScoreVO;

public interface StudentService {

    StudentInfoVO studentLogin(UserloginDTO dto);

    StudentInfoVO monitorLogin(UserloginDTO dto);

    StudentScoreVO getScore(Integer uid);

    boolean isMonitor(String uid);
}
