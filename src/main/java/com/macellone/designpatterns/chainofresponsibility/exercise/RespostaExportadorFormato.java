package com.macellone.designpatterns.chainofresponsibility.exercise;

public interface RespostaExportadorFormato {

	void setProximoExportador(RespostaExportadorFormato porcento);

	String exportar(Conta conta, Formato formato);

}
