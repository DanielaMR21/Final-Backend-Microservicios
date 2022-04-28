package com.example.catalogservice.service.impl;

import com.example.catalogservice.entity.CatalogDto;
import com.example.catalogservice.entity.MovieDto;
import com.example.catalogservice.entity.SerieDto;
import com.example.catalogservice.repository.MovieRepository;
import com.example.catalogservice.repository.SerieRepository;
import com.example.catalogservice.service.CatalogService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    private MovieRepository movieRepository;
    private SerieRepository serieRepository;

    public CatalogServiceImpl(MovieRepository movieRepository, SerieRepository serieRepository) {
        this.movieRepository = movieRepository;
        this.serieRepository = serieRepository;
    }

    @CircuitBreaker(name = "circuitGetCatalogByGenre", fallbackMethod = "fallBackGetCatalogByGenre")
    @Retry(name = "retryGetCatalogByGenre")
    public CatalogDto getCatalogByGenre(String genre) {
        List<MovieDto> movieDtos = getMoviesByGenre(genre);
        List<SerieDto> serieDtos = getSeriesByGenre(genre);
        return new CatalogDto(genre,movieDtos,serieDtos);
    }
    public CatalogDto fallBackGetCatalogByGenre(Exception e){
        return new CatalogDto("", Collections.EMPTY_LIST,Collections.EMPTY_LIST);
    }
    public List<MovieDto> getMoviesByGenre(String genre){
        return movieRepository.getMovieByGenre(genre).getBody();
    }
    public List<SerieDto> getSeriesByGenre(String genre){
        return serieRepository.findSeriesByGenre(genre).getBody();
    }


}
