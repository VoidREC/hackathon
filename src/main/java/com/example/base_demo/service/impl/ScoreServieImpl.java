package com.example.base_demo.service.impl;

import com.example.base_demo.mapper.ScoreMapper;
import com.example.base_demo.mapper.StudentMapper;
import com.example.base_demo.mapper.SubjectMapper;
import com.example.base_demo.pojo.dto.ScoreInfoDTO;
import com.example.base_demo.pojo.entity.Student;
import com.example.base_demo.pojo.entity.Subject;
import com.example.base_demo.pojo.vo.OneScoreVO;
import com.example.base_demo.pojo.vo.OneStudentScoreVO;
import com.example.base_demo.pojo.vo.SubjectInfoVO;
import com.example.base_demo.service.ScoreService;
import com.example.base_demo.service.SubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@CacheConfig(cacheNames = "score_info")
public class ScoreServieImpl implements ScoreService {

    private final ScoreMapper scoreMapper;
    private final SubjectMapper subjectMapper;
    private final StudentMapper studentMapper;
    private final SubjectService subjectService;

    public ScoreServieImpl(ScoreMapper scoreMapper, SubjectMapper subjectMapper, StudentMapper studentMapper, SubjectService subjectService) {
        this.scoreMapper = scoreMapper;
        this.subjectMapper = subjectMapper;
        this.studentMapper = studentMapper;
        this.subjectService = subjectService;
    }

    @Override
    public OneScoreVO getOneScore(ScoreInfoDTO dto) {
        OneScoreVO oneScoreVO = new OneScoreVO();
        oneScoreVO.setUid(dto.getUid());
        oneScoreVO.setTerm(dto.getTerm());

        //获得一学期内的科目
        List<Subject> subjectList = subjectMapper.getSubjectByTerm(dto.getTerm());

        //获得同班级内的学生
        List<Student> studentList = studentMapper.geSutdentByClassNumber(dto.getClassNumber());


        //创建同班级学生uid表
        List<String> uidList = new ArrayList<>(){};
        for(Student student:studentList){
            uidList.add(student.getUid());
        }

        //通过同班学生表和目标uid 获取学科信息和个人排名
        Integer sum = 0;
        List<OneScoreVO.SubjectInfo> SubjectInfoList = new ArrayList<>();
        for(Subject subject:subjectList){

            //返回科目 名称 平均分 及格率 优秀率
            SubjectInfoVO subjectInfoVO = subjectService.getSubjectInfo(uidList,subject.getId());
            OneScoreVO.SubjectInfo subjectInfo = new OneScoreVO.SubjectInfo();
            BeanUtils.copyProperties(subjectInfoVO,subjectInfo);


            //返回排名
            OneStudentScoreVO oneStudentScoreVO = subjectService.getSubjectOneStudentRand(dto.getUid(),uidList,subject.getId());

            subjectInfo.setRank(oneStudentScoreVO.getRank());
            subjectInfo.setScore(oneStudentScoreVO.getScore());
            SubjectInfoList.add(subjectInfo);


            sum+=oneStudentScoreVO.getScore();
        }
        oneScoreVO.setSubjectInfo(SubjectInfoList);
        oneScoreVO.setTotal(sum);

        return oneScoreVO;
    }

    @Override
    @Cacheable(key = "'Score'+#term+#classNumber")
    public List<OneScoreVO> getAllScore(Integer term,Integer classNumber) {

        List<OneScoreVO>  oneScoreVOList = new ArrayList<>();

        //获得同班级内的学生
        List<Student> studentList = studentMapper.geSutdentByClassNumber(classNumber);
        for (Student student:studentList){
            ScoreInfoDTO example = new ScoreInfoDTO();
            example.setUid(student.getUid());
            example.setTerm(term);
            oneScoreVOList.add(getOneScore(example));
        }
        return oneScoreVOList;
    }


}
