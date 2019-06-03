package com.rabbit.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

    @RabbitListener(queues = "test-queue")
    public void receiveMessage(@Payload String message){
        System.out.println("MESSAGE FROM 'test-queue' -> <" + message + ">");
    }
}
