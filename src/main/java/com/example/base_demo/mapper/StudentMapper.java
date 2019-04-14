package com.example.base_demo.mapper;


import com.example.base_demo.pojo.entity.Student;
import com.example.base_demo.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {


}
