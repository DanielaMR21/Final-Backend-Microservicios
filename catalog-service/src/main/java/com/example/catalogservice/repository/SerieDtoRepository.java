package com.example.catalogservice.repository;

import com.example.catalogservice.entity.SerieDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieDtoRepository extends MongoRepository<SerieDto,String> {
}
