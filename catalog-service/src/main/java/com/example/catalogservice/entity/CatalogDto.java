package com.example.catalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CatalogDto {
    private String genre;
    private List<MovieDto> movies;
    private List<SerieDto> series;
}
