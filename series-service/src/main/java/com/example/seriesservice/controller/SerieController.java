package com.example.seriesservice.controller;

import com.example.seriesservice.entity.Serie;
import com.example.seriesservice.queue.SerieSender;
import com.example.seriesservice.service.SerieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/series")
public class SerieController {

    private SerieService serieService;
    private SerieSender serieSender;

    @GetMapping("/{genre}")
    private ResponseEntity<List<Serie>> findSeriesByGenre(@PathVariable String genre){
        log.info("Se buscaron las series con genero ",genre);
        return ResponseEntity.ok(serieService.findSeriesByGenre(genre));
    }

    @PostMapping()
    private ResponseEntity<Serie> addSerie(@RequestBody Serie serie){
        log.info("Se posteo las series con titulo",serie.getName(),serie.getGenre());
        return ResponseEntity.ok(serieSender.send(serie));
    }
}
