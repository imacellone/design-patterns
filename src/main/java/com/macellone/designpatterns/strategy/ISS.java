package com.macellone.designpatterns.strategy;

public class ISS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return 0.06 * orcamento.getValor();
	}
}
