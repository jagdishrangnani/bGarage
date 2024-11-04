package com.bgarage.PartsInventory.message.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderSparePartsPublisher {

    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String message)
    {
        rabbitTemplate.convertAndSend(
                "spare-parts", "spare-parts", message);
    }

}
