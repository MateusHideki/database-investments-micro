package com.esalq.tcc.database_investments.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.esalq.tcc.database_investments.service.ServiceInvestmentsDatabase;

@Service
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@Autowired
	private ServiceInvestmentsDatabase serviceInvestmentsDatabase;

	@KafkaListener(topics = "scraping-topic", groupId = "scraping-group")
	public void listen(String message) {
		logger.info("Mensagem recebida do Kafka: " + message);
		serviceInvestmentsDatabase.registerTicker(message);
	}

	@KafkaListener(topics = "investments-topic", groupId = "investments-group")
	public void listenWallet(String wallet) {
		logger.info("Mensagem recebida do Kafka: " + wallet);
		serviceInvestmentsDatabase.registerWallet(wallet);

		
	}
}