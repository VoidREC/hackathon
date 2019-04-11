package com.example.base_demo.mapper;

import com.example.base_demo.pojo.entity.Film;
import com.example.base_demo.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FilmMapper extends BaseMapper<Film> {

    @Select("Select * from film")
    List<Film> getAllFilm();
}
