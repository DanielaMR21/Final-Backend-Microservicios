package com.example.seriesservice.service.impl;

import com.example.seriesservice.entity.Serie;
import com.example.seriesservice.repository.SerieRepository;
import com.example.seriesservice.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements SerieService {

    private SerieRepository serieRepository;

    public SerieServiceImpl(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    @Override
    public Serie saveSerie(Serie series) {
        return serieRepository.save(series);
    }

    @Override
    public List<Serie> findSeriesByGenre(String genre) {
        return serieRepository.findSeriesByGenre(genre);
    }

}
