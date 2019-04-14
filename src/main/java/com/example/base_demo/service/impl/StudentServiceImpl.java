package com.example.base_demo.service.impl;

import com.example.base_demo.exception.StudentLoginIncorrectException;
import com.example.base_demo.mapper.StudentMapper;
import com.example.base_demo.pojo.dto.UserloginDTO;
import com.example.base_demo.pojo.entity.Student;
import com.example.base_demo.pojo.vo.StudentInfoVO;
import com.example.base_demo.pojo.vo.StudentScoreVO;
import com.example.base_demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentInfoVO studentLogin(UserloginDTO dto) {
        Student example = new Student();
        example.setUid(dto.getUid());
        example.setPassword(dto.getPassword());
        Student student = studentMapper.selectOne(example);
        if (student == null){
            throw new StudentLoginIncorrectException("账号密码不正确");
        }
        StudentInfoVO studentInfoVO = new StudentInfoVO();
        studentInfoVO.setName(student.getName());
        return studentInfoVO;
    }

    @Override
    public StudentInfoVO monitorLogin(UserloginDTO dto) {
        Student example = new Student();
        example.setUid(dto.getUid());
        example.setPassword(dto.getPassword());
        Student student = studentMapper.selectOne(example);
        if (student == null){
            throw new StudentLoginIncorrectException("账号密码错误");
        }
        if (!isMonitor(student.getUid())){
            throw new StudentLoginIncorrectException("你可能不是班长");
        }
        StudentInfoVO studentInfoVO = new StudentInfoVO();
        studentInfoVO.setName(student.getName());
        return studentInfoVO;
    }

    @Override
    public StudentScoreVO getScore(Integer uid) {
        return null;
    }

    @Override
    public boolean isMonitor(String uid) {
        Student student = studentMapper.selectByPrimaryKey(uid);
        return student.getMonitor()==1;
    }
}
