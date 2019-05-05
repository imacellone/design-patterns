package com.macellone.designpatterns.chainofresponsibility;

public class DescontoPorCincoItems implements Desconto {
	private Desconto proximoDesconto;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItems().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximoDesconto.desconta(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
}
