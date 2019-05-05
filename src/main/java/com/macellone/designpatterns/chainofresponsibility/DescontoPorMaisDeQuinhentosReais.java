package com.macellone.designpatterns.chainofresponsibility;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximoDesconto;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() >= 500) {
			return orcamento.getValor() * 0.07;
		}
		return proximoDesconto.desconta(orcamento);
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximoDesconto = proximo;

	}

}
