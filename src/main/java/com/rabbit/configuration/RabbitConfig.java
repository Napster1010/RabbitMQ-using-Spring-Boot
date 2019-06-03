package com.rabbit.configuration;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Autowired
    private ConnectionFactory connectionFactory;

    public static final String QUEUE_NAME = "test-queue";
    public static final String EXCHANGE_NAME = "test-exchange";
    public static final String ROUTING_KEY = "test-key";

    @Bean
    Queue testQueue(){
        return QueueBuilder.durable(QUEUE_NAME).build();
    }

    @Bean
    Exchange testExchange(){
        return ExchangeBuilder.directExchange(EXCHANGE_NAME).build();
    }

    @Bean
    Binding testBinding(Queue queue, DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    @Bean
    RabbitTemplate testExchangeTemplate(){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setExchange(RabbitConfig.EXCHANGE_NAME);
        rabbitTemplate.setRoutingKey(RabbitConfig.ROUTING_KEY);
        return rabbitTemplate;
    }
}
