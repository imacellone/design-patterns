package com.macellone.designpatterns.chainofresponsibility.exercise;

public class ExportadorCSV implements RespostaExportadorFormato {

	private RespostaExportadorFormato proximoExportador;
	private static final Formato FORMATO = Formato.CSV;
	
	@Override
	public void setProximoExportador(RespostaExportadorFormato proximoExportador) {
		this.proximoExportador = proximoExportador;
	}

	@Override
	public String exportar(Conta conta, Formato formato) {
		if (!souEu(formato))
			return proximoExportador.exportar(conta, formato);
		
		return exportar(conta);
	}
	
	private boolean souEu(Formato formato) {
		return FORMATO.equals(formato);
	}
	
	private String exportar(Conta conta) {
		return "\"" + conta.getTitular() + "\", \"" + conta.getSaldo() + "\"";
	}

}