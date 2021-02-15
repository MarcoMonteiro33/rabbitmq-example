package br.com.poc.rabbitmq.mensageria.queue;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataImportQueue {

    @Value("${queue.data.import}")
    private String dataImportQueue;

    @Bean
    public Queue queue() {
        return new Queue(dataImportQueue, true);
    }


}
