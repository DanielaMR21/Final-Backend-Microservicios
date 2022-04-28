package com.example.catalogservice.repository;

import com.example.catalogservice.entity.SerieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "series-service")
public interface SerieRepository {
    @GetMapping("/series/{genre}")
    ResponseEntity<List<SerieDto>> findSeriesByGenre(@PathVariable String genre);
}
