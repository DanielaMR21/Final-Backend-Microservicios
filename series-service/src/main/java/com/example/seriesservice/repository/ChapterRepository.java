package com.example.seriesservice.repository;

import com.example.seriesservice.entity.Chapter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChapterRepository extends MongoRepository<Chapter,String> {
}
