package br.com.doae.ws.server.entity;

import java.util.Calendar;

public class DoacaoRealizada {

	private Calendar dataDoacao;

	public DoacaoRealizada() {
		super();
	}

	public DoacaoRealizada(Calendar dataDoacao) {
		super();
		this.dataDoacao = dataDoacao;
	}

	public Calendar getDataDoacao() {
		return dataDoacao;
	}

	public void setDataDoacao(Calendar dataDoacao) {
		this.dataDoacao = dataDoacao;
	}
}
