package com.esalq.tcc.database_investments.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Acao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String ticker;
	private String valorAtual;
	private String variacaoAtivoDiaAnterior;
	private String variacaoValorizacaoMesAtual;
	private String variacaoValorizacaoAnoAnterior;

	public Acao() {
	}

	public Acao(String ticker, String valorAtual, String variacaoAtivoDiaAnterior, String variacaoValorizacaoMesAtual,
			String variacaoValorizacaoAnoAnterior) {
		super();
		this.ticker = ticker;
		this.valorAtual = valorAtual;
		this.variacaoAtivoDiaAnterior = variacaoAtivoDiaAnterior;
		this.variacaoValorizacaoMesAtual = variacaoValorizacaoMesAtual;
		this.variacaoValorizacaoAnoAnterior = variacaoValorizacaoAnoAnterior;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getValorAtual() {
		return valorAtual;
	}

	public void setValorAtual(String valorAtual) {
		this.valorAtual = valorAtual;
	}

	public String getVariacaoAtivoDiaAnterior() {
		return variacaoAtivoDiaAnterior;
	}

	public void setVariacaoAtivoDiaAnterior(String variacaoAtivoDiaAnterior) {
		this.variacaoAtivoDiaAnterior = variacaoAtivoDiaAnterior;
	}

	public String getVariacaoValorizacaoMesAtual() {
		return variacaoValorizacaoMesAtual;
	}

	public void setVariacaoValorizacaoMesAtual(String variacaoValorizacaoMesAtual) {
		this.variacaoValorizacaoMesAtual = variacaoValorizacaoMesAtual;
	}

	public String getVariacaoValorizacaoAnoAnterior() {
		return variacaoValorizacaoAnoAnterior;
	}

	public void setVariacaoValorizacaoAnoAnterior(String variacaoValorizacaoAnoAnterior) {
		this.variacaoValorizacaoAnoAnterior = variacaoValorizacaoAnoAnterior;
	}

	@Override
	public String toString() {
		return "Acao [ticker=" + ticker + ", valorAtual=" + valorAtual + ", variacaoAtivoDiaAnterior="
				+ variacaoAtivoDiaAnterior + ", variacaoValorizacaoMesAtual=" + variacaoValorizacaoMesAtual
				+ ", variacaoValorizacaoAnoAnterior=" + variacaoValorizacaoAnoAnterior + "]";
	}

}
