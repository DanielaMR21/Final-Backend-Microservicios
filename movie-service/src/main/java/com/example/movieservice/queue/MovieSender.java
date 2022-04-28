package com.example.movieservice.queue;

import com.example.movieservice.entity.Movie;
import com.example.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MovieSender {
    private final MovieService movieService;
    private final RabbitTemplate rabbitTemplate;
    private final Queue queueMovie;


    public Movie send(Movie movie){
        rabbitTemplate.convertAndSend(queueMovie.getName(),movieService.save(movie));
        return movie;
    }
}