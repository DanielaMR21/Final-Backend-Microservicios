package com.example.catalogservice.repository;

import com.example.catalogservice.entity.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movies-service")
public interface MovieRepository {
    @GetMapping("/movies/{genre}")
    ResponseEntity<List<MovieDto>> getMovieByGenre(@PathVariable String genre);
}
