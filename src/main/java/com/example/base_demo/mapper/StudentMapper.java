package com.example.base_demo.mapper;


import com.example.base_demo.pojo.entity.Student;
import com.example.base_demo.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    @Select("Select * from student where #{classNumber}")
    List<Student> geSutdentByClassNumber(Integer classNumber);
}
