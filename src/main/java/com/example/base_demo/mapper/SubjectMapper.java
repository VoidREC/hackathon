package com.example.base_demo.mapper;


import com.example.base_demo.pojo.entity.Subject;
import com.example.base_demo.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SubjectMapper extends BaseMapper<Subject> {

    @Select("Select * from subject where id = #{subjectId}")
    Subject getSubjectById(Integer subjectId);

    @Select("Select * from subject where term = #{term}")
    List<Subject> getSubjectByTerm(Integer term);
}
