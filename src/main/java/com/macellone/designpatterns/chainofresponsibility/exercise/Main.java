package com.macellone.designpatterns.chainofresponsibility.exercise;

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta("Joao", 1234.88);
		
		ExportadorConta exportador = new ExportadorConta();
		
		System.out.println(exportador.exportar(conta, Formato.CSV));
		System.out.println();

		System.out.println(exportador.exportar(conta, Formato.PORCENTO));
		System.out.println();

		System.out.println(exportador.exportar(conta, Formato.XML));
		System.out.println();
	}
}
