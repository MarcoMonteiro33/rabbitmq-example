package br.com.poc.rabbitmq.mensageria.queue;

import br.com.poc.rabbitmq.mensageria.queue.DataImportQueue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class FileSendQueue {

    private final RabbitTemplate rabbitTemplate;
    private final DataImportQueue dataImportQueue;

    public FileSendQueue(RabbitTemplate rabbitTemplate, DataImportQueue dataImportQueue) {
        this.rabbitTemplate = rabbitTemplate;
        this.dataImportQueue = dataImportQueue;
    }

    public void send(String msg){
        rabbitTemplate.convertAndSend(this.dataImportQueue.queue().getName(), msg);
        System.out.println(msg);
    }


}
