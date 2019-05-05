package com.macellone.designpatterns.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("Lapis", 200));
		orcamento.adicionaItem(new Item("Caneta", 300));

		double descontoFinal = new CalculadoraDeDescontos().calcula(orcamento);
		System.out.println(descontoFinal);
	}
}
