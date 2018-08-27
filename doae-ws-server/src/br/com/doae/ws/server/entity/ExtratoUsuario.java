package br.com.doae.ws.server.entity;

public class ExtratoUsuario {

	private int codigo;
	private double totalPontos;

	public ExtratoUsuario() {
		super();
	}

	public ExtratoUsuario(double totalPontos) {
		super();
		this.totalPontos = totalPontos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(double totalPontos) {
		this.totalPontos = totalPontos;
	}

}
