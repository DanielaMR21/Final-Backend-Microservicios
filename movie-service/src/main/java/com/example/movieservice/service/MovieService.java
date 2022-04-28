package com.example.movieservice.service;

import com.example.movieservice.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllByGenre(String genre);
    Movie save(Movie movie);
}
