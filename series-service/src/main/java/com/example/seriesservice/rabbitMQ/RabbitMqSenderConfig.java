package com.example.seriesservice.rabbitMQ;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqSenderConfig {
    @Value("${queue.serie.name}")
    private String serieQueue;

    @Bean
    public Queue queue(){
        return new Queue(serieQueue,true);
    }
}
