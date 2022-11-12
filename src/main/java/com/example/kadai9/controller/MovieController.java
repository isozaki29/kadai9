package com.example.kadai9.controller;

import com.example.kadai9.entity.Movie;
import com.example.kadai9.mapper.MovieMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieMapper movieMapper;

    public MovieController(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    //全件取得
    @GetMapping("/movies")
    public List<Movie> getMovie() {
        List<Movie> movie = movieMapper.findAll();
        return movie;
    }

    //公開年から映画情報を取得
    @GetMapping("/movies/{publishedYear}")
    public List<Movie> getMovie(@PathVariable("publishedYear") int publishedYear) {
        List<Movie> movie = movieMapper.findByPublishedYear(publishedYear);
        return movie;
    }
}
