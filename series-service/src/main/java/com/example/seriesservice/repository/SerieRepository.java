package com.example.seriesservice.repository;

import com.example.seriesservice.entity.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends MongoRepository<Serie,String> {
    public List<Serie> findSeriesByGenre(String genre);
}
