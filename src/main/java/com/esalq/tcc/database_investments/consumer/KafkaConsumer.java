package com.esalq.tcc.database_investments.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.esalq.tcc.database_investments.service.ServiceInvestmentsDatabase;

@Service
public class KafkaConsumer {

	@Autowired
	private ServiceInvestmentsDatabase serviceInvestmentsDatabase;

	@KafkaListener(topics = "scraping-topic", groupId = "scraping-group")
	public void listen(String message) {
		System.out.println("Mensagem recebida do Kafka: " + message);
		serviceInvestmentsDatabase.process(message);
	}

}