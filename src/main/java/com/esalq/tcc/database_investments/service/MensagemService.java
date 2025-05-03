package com.esalq.tcc.database_investments.service;
import org.springframework.stereotype.Service;

import com.esalq.tcc.database_investments.model.Acao;
import com.esalq.tcc.database_investments.repository.MensagemRepository;

@Service
public class MensagemService {

    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public void salvarMensagem(Acao acao) {
        mensagemRepository.save(acao);
    }
}
