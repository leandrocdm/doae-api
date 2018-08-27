package br.com.doae.ws.server.entity;

public class Premio {

	private String descricao;
	private String fornecedor;
	private String acao;
	private double pontos;
	private boolean disponive;

	public Premio() {
		super();
	}

	public Premio(String descricao, String fornecedor, String acao, double pontos, boolean disponive) {
		super();
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.acao = acao;
		this.pontos = pontos;
		this.disponive = disponive;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public boolean isDisponive() {
		return disponive;
	}

	public void setDisponive(boolean disponive) {
		this.disponive = disponive;
	}

}
