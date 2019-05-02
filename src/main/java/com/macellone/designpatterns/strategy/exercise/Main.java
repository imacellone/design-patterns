package com.macellone.designpatterns.strategy.exercise;

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta(1000);
		RealizadorDeInvestimento realizador = new RealizadorDeInvestimento();
		
		ResultadoInvestimento moderado = realizador.investir(conta, new Moderado());
		System.out.println("Moderado: Investido: " + moderado.getValorInvestido() + " Bruto: " + moderado.getValorBrutoRetornado() + " Liquido: " + moderado.getValorLiquidoRetornado() + " Saldo: " + conta.getSaldo());
		
		ResultadoInvestimento conservador = realizador.investir(conta, new Conservador());
		System.out.println("Conservador: Investido: " + conservador.getValorInvestido() + " Bruto: " + conservador.getValorBrutoRetornado() + " Liquido: " + conservador.getValorLiquidoRetornado() + " Saldo: " + conta.getSaldo());
		
		ResultadoInvestimento arrojado = realizador.investir(conta, new Arrojado());
		System.out.println("Arrojado: Investido: " + arrojado.getValorInvestido() + " Bruto: " + arrojado.getValorBrutoRetornado() + " Liquido: " + arrojado.getValorLiquidoRetornado() + " Saldo: " + conta.getSaldo());
	}
}