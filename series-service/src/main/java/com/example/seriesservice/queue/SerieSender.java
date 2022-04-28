package com.example.seriesservice.queue;

import com.example.seriesservice.entity.Serie;
import com.example.seriesservice.service.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SerieSender {
    private final SerieService movieService;

    private final RabbitTemplate rabbitTemplate;

    private final Queue queueSerie;


    public Serie send(Serie serie){
        rabbitTemplate.convertAndSend(queueSerie.getName(),movieService.saveSerie(serie));
        return serie;
    }
}
