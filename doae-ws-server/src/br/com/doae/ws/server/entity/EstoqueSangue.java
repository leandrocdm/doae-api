package br.com.doae.ws.server.entity;

public class EstoqueSangue {
	
	private int codigo;
	private int qtdMaxima;
	private int qtdAtual;
	private Sangue sangue;
	private Hemocentro hemocentro;

	public EstoqueSangue() {super();}

	public EstoqueSangue(int qtdMaxima, int qtdAtual, Sangue sangue, Hemocentro hemocentro) {
		super();
		this.qtdMaxima = qtdMaxima;
		this.qtdAtual = qtdAtual;
		this.sangue = sangue;
		this.hemocentro = hemocentro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(int qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public Sangue getSangue() {
		return sangue;
	}

	public void setSangue(Sangue sangue) {
		this.sangue = sangue;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}
}
