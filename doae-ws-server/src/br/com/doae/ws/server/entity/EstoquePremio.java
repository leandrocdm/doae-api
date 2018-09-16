package br.com.doae.ws.server.entity;

public class EstoquePremio {
	
	private int codigo;
	private Premio premio;
	private int quantidade;

	public EstoquePremio() {super();}

	public EstoquePremio(Premio premio, int quantidade) {
		super();
		this.premio = premio;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
