package com.bgarage.PartsInventory.message.configuration;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {


    @Bean public Queue queue()
    {
        return new Queue("spare-parts", false);
    }

    @Bean public Exchange exchange()
    {
        return new DirectExchange("spare-parts");
    }

    @Bean
    public Binding binding(Queue queue, Exchange exchange)
    {
        return BindingBuilder.bind(queue)
                .to(exchange)
                .with("spare-parts")
                .noargs();
    }
}
