package br.com.poc.rabbitmq.mensageria;

import br.com.poc.rabbitmq.mensageria.queue.FileSendQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MensageriaApplication {

	private final FileSendQueue fileSendQueue;

	public MensageriaApplication(FileSendQueue fileSendQueue) {
		this.fileSendQueue = fileSendQueue;
		fileSendQueue.send("Enviando msg para Rabbitmq!!");
	}

	public static void main(String[] args) {
		SpringApplication.run(MensageriaApplication.class, args);
	}

}
