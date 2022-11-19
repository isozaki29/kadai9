package com.example.kadai9.controller;

import com.example.kadai9.entity.Movie;
import com.example.kadai9.mapper.MovieMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    
    private final MovieMapper movieMapper;

    public MovieController(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    ///全件取得
    @GetMapping
    public List<Movie> getMovie() {
        List<Movie> movie = movieMapper.findAll();
        return movie;
    }

    //公開年から映画情報を取得
    @GetMapping("/publishedYear")
    public List<Movie> getMovie(@RequestParam("publishedYear") int publishedYear) {
        List<Movie> movie = movieMapper.findByPublishedYear(publishedYear);
        return movie;
    }
}
