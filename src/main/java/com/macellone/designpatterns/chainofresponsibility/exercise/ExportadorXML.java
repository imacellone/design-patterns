package com.macellone.designpatterns.chainofresponsibility.exercise;

public class ExportadorXML implements RespostaExportadorFormato {

	private RespostaExportadorFormato proximoExportador;
	private static final Formato FORMATO = Formato.XML;
	
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
		return new StringBuilder()
				.append("<conta>")
				.append("<titula>")
				.append(conta.getTitular())
				.append("</titular>")
				.append("<saldo>")
				.append(conta.getSaldo())
				.append("</saldo>")
				.append("</conta>")
				.toString();
	}

}