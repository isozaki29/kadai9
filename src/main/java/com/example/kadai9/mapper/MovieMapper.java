package com.example.kadai9.mapper;

import com.example.kadai9.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieMapper {

    @Select("SELECT * from movies")
    List<Movie> findAll();

    @Select("SELECT * from movies WHERE published_year = #{publishedYear}")
    List<Movie> findByPublishedYear(int publishedYear);

}
