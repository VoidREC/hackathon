package com.example.base_demo.service.impl;

import com.example.base_demo.mapper.ScoreMapper;
import com.example.base_demo.mapper.StudentMapper;
import com.example.base_demo.mapper.SubjectMapper;
import com.example.base_demo.pojo.dto.SubjectInfoDTO;
import com.example.base_demo.pojo.entity.Score;
import com.example.base_demo.pojo.entity.Student;
import com.example.base_demo.pojo.entity.Subject;
import com.example.base_demo.pojo.vo.OneStudentScoreVO;
import com.example.base_demo.pojo.vo.SubjectInfoVO;
import com.example.base_demo.service.SubjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectMapper subjectMapper;
    private final ScoreMapper scoreMapper;
    private final StudentMapper studentMapper;

    public SubjectServiceImpl(SubjectMapper subjectMapper, ScoreMapper scoreMapper, StudentMapper studentMapper) {
        this.subjectMapper = subjectMapper;
        this.scoreMapper = scoreMapper;
        this.studentMapper = studentMapper;
    }

    @Override
    public SubjectInfoVO getSubjectInfo(List<String> uidList,Integer subjectId) {

        //找到对应科目
        SubjectInfoVO subjectInfoVO = new SubjectInfoVO();
        Subject subject = subjectMapper.getSubjectById(subjectId);
        BeanUtils.copyProperties(subject,subjectInfoVO);

        //该科目成绩排序、及格率、优秀率、平均值
        List<Score> scoreList = new ArrayList<>(){};
        scoreList = scoreMapper.getScore(subjectId);
        
        //及格率
        Double pass=0.00,excellent=0.00;
        String passRate,average,excellentRate;
        Double sum=0.00;
        for (Score score:scoreList){
            sum+=score.getScore();
            if (score.getScore()>=80){
                pass++;
                excellent++;
            }
            else if (score.getScore()>=60){
                pass++;
            }
        }

        average= Double.parseDouble(String.format("%.2f", (sum/scoreList.size())))+"";
        passRate= Double.parseDouble(String.format("%.2f", (pass/scoreList.size()*100)))+"%";
        excellentRate= Double.parseDouble(String.format("%.2f", (excellent/scoreList.size()*100)))+"%";

        subjectInfoVO.setAverage(average);
        subjectInfoVO.setExcellentRate(excellentRate);
        subjectInfoVO.setPassRate(passRate);

        return subjectInfoVO;
    }

    @Override
    public OneStudentScoreVO getSubjectOneStudentRand(String targetUid, List<String> uidList, Integer subjectId) {

        List<Score> scoreList = new ArrayList<>();
        scoreList = scoreMapper.getScore(subjectId);


        scoreList.sort((o1, o2) -> {
            return -(o1.getScore().compareTo(o2.getScore()));
        });
//        System.out.println(scoreList.get(0));
        Score example = new Score();
        example.setUid(targetUid);
//        System.out.println(scoreList.indexOf(example));

        int i=1;
        for (Score score:scoreList){
            if(score.getUid().equals(targetUid)){
                break;
            }
            i++;
        }
        OneStudentScoreVO oneStudentScoreVO = new OneStudentScoreVO();
        oneStudentScoreVO.setRank(i);

        Score score = scoreMapper.getScoreByUidAndSubjectId(targetUid,subjectId);
        oneStudentScoreVO.setScore(score.getScore());
        return oneStudentScoreVO;
    }

    @Override
    public List<SubjectInfoVO> justGetSubjectInfo(SubjectInfoDTO dto) {


        //获得同班级内的学生
         List<Student> studentList = studentMapper.geSutdentByClassNumber(dto.getClassNumber());

        //创建同班级学生uid表
        List<String> uidList = new ArrayList<>(){};
        for(Student student:studentList){
            uidList.add(student.getUid());
        }

        //获得一学期内的科目
        List<Subject> subjectList = subjectMapper.getSubjectByTerm(dto.getTerm());

        List<SubjectInfoVO> subjectInfoVOList = new ArrayList<>();

        for(Subject subject:subjectList){
            subjectInfoVOList.add(getSubjectInfo(uidList,subject.getId()));
        }

        return subjectInfoVOList;
    }



}
