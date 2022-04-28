package com.example.catalogservice.service.impl;

import com.example.catalogservice.entity.SerieDto;
import com.example.catalogservice.repository.SerieDtoRepository;
import com.example.catalogservice.service.SerieDtoService;
import org.springframework.stereotype.Service;

@Service
public class SerieDtoServiceImpl implements SerieDtoService {

    private SerieDtoRepository serieRepository;

    public SerieDtoServiceImpl(SerieDtoRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    @Override
    public SerieDto saveSerie(SerieDto serieDto) {
        return serieRepository.save(serieDto);
    }
}
