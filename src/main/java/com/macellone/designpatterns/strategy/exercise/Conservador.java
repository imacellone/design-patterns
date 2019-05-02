package com.macellone.designpatterns.strategy.exercise;

public class Conservador implements Investimento {

	public double investir(Conta conta) {
		return conta.getSaldo() * 0.8;
	}

}
