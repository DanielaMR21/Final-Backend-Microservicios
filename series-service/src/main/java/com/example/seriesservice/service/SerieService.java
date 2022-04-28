package com.example.seriesservice.service;

import com.example.seriesservice.entity.Serie;

import java.util.List;

public interface SerieService {
    public Serie saveSerie(Serie series);
    public List<Serie> findSeriesByGenre(String genre);
}
