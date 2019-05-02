package com.macellone.designpatterns.strategy.exercise;

import java.util.Random;

public class Moderado implements Investimento {
	
	private Random random = new Random();

	public double investir(Conta conta) {
		if (random.nextBoolean())
			return conta.getSaldo() * 0.025;
		return conta.getSaldo() * 0.007;
	}

}
