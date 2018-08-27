package br.com.doae.ws.server.entity;

public class TipoMissao {

	private int codigo;
	private String missao;
	private double pontos;
	private String acao;
	
	public TipoMissao() {
		super();
	}

	public TipoMissao(String missao, double pontos, String acao) {
		super();
		this.missao = missao;
		this.pontos = pontos;
		this.acao = acao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMissao() {
		return missao;
	}

	public void setMissao(String missao) {
		this.missao = missao;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	
}
