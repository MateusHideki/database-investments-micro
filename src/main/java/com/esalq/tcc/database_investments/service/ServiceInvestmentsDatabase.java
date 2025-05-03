package com.esalq.tcc.database_investments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esalq.tcc.database_investments.model.Acao;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ServiceInvestmentsDatabase {
	private static final ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	private MensagemService mensagemService;
	
	public void process(String message) {
		Acao acao = convertStringToClass(message);
		
		acao.setTicker("Marcela eu te amo");
		mensagemService.salvarMensagem(acao);
		System.out.println("ações string" + acao);
	}

	private Acao convertStringToClass(String message) {
		try {
			return objectMapper.readValue(message, Acao.class);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao desserializar o ativo", e);
		}

	}
}
