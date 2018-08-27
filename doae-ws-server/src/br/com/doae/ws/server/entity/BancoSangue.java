package br.com.doae.ws.server.entity;

public class BancoSangue {

	private int codigo;
	private int sangue;
	private long qtiSangue;

	public BancoSangue() {
		super();
	}

	public BancoSangue(int codigoCentroDoacao, int sangue, long qtiSangue) {
		super();
		this.sangue = sangue;
		this.qtiSangue = qtiSangue;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSangue() {
		return sangue;
	}

	public void setSangue(int sangue) {
		this.sangue = sangue;
	}

	public long getQtiSangue() {
		return qtiSangue;
	}

	public void setQtiSangue(long qtiSangue) {
		this.qtiSangue = qtiSangue;
	}

}
