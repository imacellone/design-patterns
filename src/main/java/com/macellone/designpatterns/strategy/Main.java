package com.macellone.designpatterns.strategy;

public class Main {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.calcula(orcamento, iss);
		calculador.calcula(orcamento, icms);
		
		
	}
}
