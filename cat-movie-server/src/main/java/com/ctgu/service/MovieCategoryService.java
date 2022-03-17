package com.ctgu.service;


import com.ctgu.entity.Category;
import com.ctgu.entity.Movie;
import com.ctgu.mapper.MovieCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieCategoryService {

    @Autowired
    MovieCategoryMapper movieCategoryMapper;

    void add(Movie movie) {
        for (Category category : movie.getCategories()) {
            movieCategoryMapper.insert(movie,category);
        }
    }

    void delete(Movie movie) {
        movieCategoryMapper.delete(movie);
    }
}
