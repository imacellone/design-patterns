package com.macellone.designpatterns.strategy.exercise;

public class Conta {
	
	private double saldo;

	public Conta (double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
}