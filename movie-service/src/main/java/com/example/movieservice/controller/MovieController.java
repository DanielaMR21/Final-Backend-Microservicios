package com.example.movieservice.controller;

import com.example.movieservice.entity.Movie;
import com.example.movieservice.queue.MovieSender;
import com.example.movieservice.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;
    private MovieSender movieSender;

    public MovieController(MovieService movieService, MovieSender movieSender) {
        this.movieService = movieService;
        this.movieSender = movieSender;
    }

    @GetMapping("/{genre}")
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> getAllByGenre(@PathVariable String genre) {
        log.info("Peliculas buscadas con el genero: ",genre);
        return movieService.getAllByGenre(genre);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Movie saveMovie(@RequestBody Movie movie) {
        log.info("Se crea la pelicula ",movie.getName(),movie.getGenre());
        return movieSender.send(movie);
    }
}
