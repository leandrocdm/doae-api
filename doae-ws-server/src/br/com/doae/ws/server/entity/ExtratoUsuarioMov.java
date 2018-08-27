package br.com.doae.ws.server.entity;

import java.util.Calendar;

public class ExtratoUsuarioMov {

	private int codigo;
	private int codigoItem; // estamos sem tabela item?
	private Calendar data;
	private char tipoAcao;
	private double pontos;

	public ExtratoUsuarioMov() {
		super();
	}

	public ExtratoUsuarioMov(int extrato1, int codigoItem, Calendar data, char tipoAcao, double pontos) {
		super();
		this.codigoItem = codigoItem;
		this.data = data;
		this.tipoAcao = tipoAcao;
		this.pontos = pontos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public char getTipoAcao() {
		return tipoAcao;
	}

	public void setTipoAcao(char tipoAcao) {
		this.tipoAcao = tipoAcao;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

}
