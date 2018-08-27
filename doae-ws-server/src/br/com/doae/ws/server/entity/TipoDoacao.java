package br.com.doae.ws.server.entity;

public class TipoDoacao {

	private int codigo;
	private String descricao;

	public TipoDoacao() {
		super();
	}

	public TipoDoacao(String descricao) {
		super();
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
