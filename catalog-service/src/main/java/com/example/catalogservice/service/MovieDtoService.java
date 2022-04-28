package com.example.catalogservice.service;

import com.example.catalogservice.entity.MovieDto;

import java.util.List;

public interface MovieDtoService {
    MovieDto saveMovie(MovieDto movieDto);
    List<MovieDto> findMoviesByGenre(String genre);
}
