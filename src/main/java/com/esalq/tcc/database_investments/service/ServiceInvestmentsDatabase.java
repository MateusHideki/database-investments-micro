package com.esalq.tcc.database_investments.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esalq.tcc.database_investments.model.Acao;
import com.esalq.tcc.database_investments.model.Wallet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Service
public class ServiceInvestmentsDatabase {
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static final Logger logger = LoggerFactory.getLogger(ServiceInvestmentsDatabase.class);

	@Autowired
	private MensagemService mensagemService;
	
	public void registerTicker(String message) {
		Acao acao = convertStringToClass(message, Acao.class);
		mensagemService.saveAsset(acao);
		logger.info("ação " + acao);
	}

	public void registerWallet(String message) {
		Wallet wallet = convertStringToClass(message, Wallet.class);
		mensagemService.saveWallet(wallet);
		logger.info("wallet: " + wallet);
	}
	
	public <T> T convertStringToClass(String message, Class<T> clazz) {
	    try {
	    	ObjectMapper objectMapper = new ObjectMapper();
	    	objectMapper.registerModule(new JavaTimeModule());
	    	objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	    	
	        return objectMapper.readValue(message, clazz);
	    } catch (Exception e) {
	        throw new RuntimeException("Erro ao desserializar o objeto: " + clazz.getSimpleName(), e);
	    }
	}

}
