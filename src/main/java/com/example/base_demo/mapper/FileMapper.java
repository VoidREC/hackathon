package com.example.base_demo.mapper;

import com.example.base_demo.pojo.entity.File;
import com.example.base_demo.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface FileMapper extends BaseMapper<File> {
}
