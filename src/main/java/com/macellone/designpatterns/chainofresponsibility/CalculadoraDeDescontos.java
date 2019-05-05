package com.macellone.designpatterns.chainofresponsibility;

public class CalculadoraDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoPorCincoItems();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(new SemDesconto());
		
		return d1.desconta(orcamento);
	}
}
