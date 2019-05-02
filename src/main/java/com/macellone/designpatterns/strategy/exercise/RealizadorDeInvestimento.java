package com.macellone.designpatterns.strategy.exercise;

public class RealizadorDeInvestimento {

	public ResultadoInvestimento investir(Conta conta, Investimento investimento) {
		ResultadoInvestimento retorno = calcularRetorno(conta, investimento);
		conta.deposita(retorno.getValorLiquidoRetornado());
		return retorno;
	}

	private ResultadoInvestimento calcularRetorno(Conta conta, Investimento investimento) {
		double valorInvestido = conta.getSaldo();
		double valorBrutoRetornado = investimento.investir(conta);
		double valorLiquidoRetornado = valorBrutoRetornado * 0.7;
		return new ResultadoInvestimento(valorInvestido, valorBrutoRetornado, valorLiquidoRetornado);
	}

}