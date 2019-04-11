package com.example.base_demo.service;

import com.example.base_demo.pojo.dto.FilmPageDTO;

public interface FilmService {

    Object getFilm(FilmPageDTO dto);

    Object getAllFilm();
}
