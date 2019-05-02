package com.macellone.designpatterns.strategy.exercise;

public class ResultadoInvestimento {

	private final double valorInvestido;
	private final double valorBrutoRetornado;
	private final double valorLiquidoRetornado;
	
	public ResultadoInvestimento(double valorInvestido, double valorBrutoRetornado, double valorLiquidoRetornado) {
		this.valorInvestido = valorInvestido;
		this.valorBrutoRetornado = valorBrutoRetornado;
		this.valorLiquidoRetornado = valorLiquidoRetornado;
	}

	public double getValorInvestido() {
		return valorInvestido;
	}

	public double getValorBrutoRetornado() {
		return valorBrutoRetornado;
	}

	public double getValorLiquidoRetornado() {
		return valorLiquidoRetornado;
	}
	
	
	
}
