package com.macellone.designpatterns.strategy.exercise;

import java.util.Random;

public class Arrojado implements Investimento {

	private Random random = new Random();

	public double investir(Conta conta) {
		int chance = random.nextInt(10);
		
		if (chance <= 1) { // 20% de chance -> 5%
			return conta.getSaldo() * 0.05;
		}

		if (chance <= 4) { // 30% de chance -> 3%
			return conta.getSaldo() * 0.03;
		}

		// 50% de chance -> 0,6%
		return conta.getSaldo() * 0.006;
	}

}
