package com.macellone.designpatterns.chainofresponsibility.exercise;

public class ExportadorEndOfChain implements RespostaExportadorFormato {

	@Override
	public void setProximoExportador(RespostaExportadorFormato porcento) {
	}

	@Override
	public String exportar(Conta conta, Formato formato) {
		throw new RuntimeException();
	}

}
