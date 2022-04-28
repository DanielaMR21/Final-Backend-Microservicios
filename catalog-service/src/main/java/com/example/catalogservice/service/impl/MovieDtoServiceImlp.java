package com.example.catalogservice.service.impl;

import com.example.catalogservice.entity.MovieDto;
import com.example.catalogservice.repository.MovieDtoRepository;
import com.example.catalogservice.service.MovieDtoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieDtoServiceImlp implements MovieDtoService {

    private MovieDtoRepository movieRepository;

    public MovieDtoServiceImlp(MovieDtoRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieDto saveMovie(MovieDto movieDto) {
        return movieRepository.save(movieDto);
    }

    @Override
    public List<MovieDto> findMoviesByGenre(String genre) {
        return movieRepository.findAllByGenre(genre);
    }
}
