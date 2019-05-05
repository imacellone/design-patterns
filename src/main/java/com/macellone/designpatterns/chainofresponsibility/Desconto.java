package com.macellone.designpatterns.chainofresponsibility;

public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximoDesconto(Desconto proximo);

}
