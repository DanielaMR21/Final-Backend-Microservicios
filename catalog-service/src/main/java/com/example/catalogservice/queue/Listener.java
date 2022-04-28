package com.example.catalogservice.queue;

import com.example.catalogservice.entity.MovieDto;
import com.example.catalogservice.entity.SerieDto;
import com.example.catalogservice.service.MovieDtoService;
import com.example.catalogservice.service.SerieDtoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Listener {

    private MovieDtoService movieDtoService;
    private SerieDtoService serieDtoService;

    public Listener(MovieDtoService movieDtoService, SerieDtoService serieDtoService) {
        this.movieDtoService = movieDtoService;
        this.serieDtoService = serieDtoService;
    }

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void receive(@Payload MovieDto movieDto){
        log.info("Se guarda la pelicula con titulo {} ",movieDto.getName());
        movieDtoService.saveMovie(movieDto);
    }

    @RabbitListener(queues = {"${queue.serie.name}"})
    public void receive(@Payload SerieDto serieDto){
        log.info("Se guardo la serie con titulo {} ",serieDto.getName());
        serieDtoService.saveSerie(serieDto);
    }
}
