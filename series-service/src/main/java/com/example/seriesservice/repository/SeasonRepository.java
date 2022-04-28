package com.example.seriesservice.repository;

import com.example.seriesservice.entity.Season;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonRepository extends MongoRepository<Season,String> {
}
