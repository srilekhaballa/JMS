package com.example.userqueuelistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {
    private static Logger logger = LoggerFactory.getLogger(MessageListner.class);

    @RabbitListener(queues = "2032-queue1")
    public void listner(CustomMessage message) {
        logger.info("Recieved Message is: " + message);
    }
}
