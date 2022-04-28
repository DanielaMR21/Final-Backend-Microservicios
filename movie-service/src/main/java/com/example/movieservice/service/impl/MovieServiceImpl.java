package com.example.movieservice.service.impl;

import com.example.movieservice.entity.Movie;
import com.example.movieservice.repository.MovieRepository;
import com.example.movieservice.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllByGenre(String genre) {
        return movieRepository.findAllByGenre(genre);
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }
}
