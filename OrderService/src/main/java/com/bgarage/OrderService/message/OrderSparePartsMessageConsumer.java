package com.bgarage.OrderService.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderSparePartsMessageConsumer {

    @RabbitListener(queues = "${order.spareparts.queue}")
    public void recievedMessage(OrderSpareParts employee) {
        System.out.println("Recieved Message From RabbitMQ: " + employee);
    }
}
