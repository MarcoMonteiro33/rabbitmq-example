package br.com.poc.rabbitmq.mensageria.queue;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;



@Component
public class ConsumerQueue {

    @RabbitListener(queues = {"${queue.data.import}"})
    public void receive(@Payload String fileBody){
        System.out.println("Capturando msg no Rabbtmq: " + fileBody);
    }
}
