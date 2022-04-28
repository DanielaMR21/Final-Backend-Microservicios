package com.example.catalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "moviesDto")
public class MovieDto {
    @Id
    private Integer id;
    private String name;
    private String genre;
    private String urlStream;
}
