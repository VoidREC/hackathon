package com.example.base_demo.service;

import com.example.base_demo.pojo.dto.SubjectInfoDTO;
import com.example.base_demo.pojo.vo.OneStudentScoreVO;
import com.example.base_demo.pojo.vo.SubjectInfoVO;

import java.util.List;

public interface SubjectService {

    SubjectInfoVO getSubjectInfo(List<String> uidList, Integer subjectId);

    OneStudentScoreVO getSubjectOneStudentRand(String targetUid, List<String> uidList, Integer subjectId);

    List<SubjectInfoVO> justGetSubjectInfo(SubjectInfoDTO dto);
}
