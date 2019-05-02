package com.macellone.designpatterns.strategy;

public class CalculadorDeImpostos {

	public void calcula(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println(valorImposto);
	}

}
