package com.example.base_demo.service.impl;

import com.example.base_demo.mapper.FilmMapper;
import com.example.base_demo.pojo.dto.FilmPageDTO;
import com.example.base_demo.pojo.entity.Film;
import com.example.base_demo.service.FilmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {


    private final FilmMapper filmMapper;

    public FilmServiceImpl(FilmMapper filmMapper) {
        this.filmMapper = filmMapper;
    }


    @Override
    public Object getFilm(FilmPageDTO dto) {
        PageHelper.startPage(dto.getPageNumber(), dto.getPageSize());
        List<Film> filmList = filmMapper.getAllFilm();
        PageInfo<Film> page = new PageInfo<Film>(filmList,dto.getPageSize());
        return page.getList();
    }

    @Override
    public Object getAllFilm() {
        return filmMapper.selectAll();
    }
}
