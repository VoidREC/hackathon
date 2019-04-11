package com.example.base_demo.controller;

import com.example.base_demo.pojo.dto.FilmPageDTO;
import com.example.base_demo.service.FilmService;
import com.example.base_demo.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/film")
    public JsonResult film(@RequestParam(value = "pageNumber") Integer pageNumber,
                           @RequestParam(value = "pageSize") Integer pageSize){
        FilmPageDTO dto = new FilmPageDTO();
        dto.setPageNumber(pageNumber);
        dto.setPageSize(pageSize);
        return JsonResult.ok(filmService.getFilm(dto));
    }

    @GetMapping("/all_film")
    public JsonResult film(){
        return JsonResult.ok(filmService.getAllFilm());
    }
}
