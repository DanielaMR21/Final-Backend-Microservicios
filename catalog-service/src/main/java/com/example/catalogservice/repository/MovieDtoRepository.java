package com.example.catalogservice.repository;

import com.example.catalogservice.entity.MovieDto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieDtoRepository extends MongoRepository<MovieDto,Integer> {
    List<MovieDto> findAllByGenre(String genre);
}
