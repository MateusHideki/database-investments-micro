package com.esalq.tcc.database_investments.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esalq.tcc.database_investments.model.Acao;

public interface MensagemRepository extends JpaRepository<Acao, Long> {
}
