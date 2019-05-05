package com.macellone.designpatterns.chainofresponsibility.exercise;

public class ExportadorConta {

	
	public String exportar(Conta conta, Formato formato) {
		RespostaExportadorFormato xml = new ExportadorXML();
		RespostaExportadorFormato porcento = new ExportadorPorcento();
		RespostaExportadorFormato csv = new ExportadorCSV();
		RespostaExportadorFormato dummy = new ExportadorEndOfChain();
		
		xml.setProximoExportador(porcento);
		porcento.setProximoExportador(csv);
		csv.setProximoExportador(dummy);
		
		return xml.exportar(conta, formato);
		
	}
	
}