package br.com.doae.ws.server.entity;

public class Estado {

	private int codigo;
	private String nome;

	public Estado(String nome) {
		super();
		this.nome = nome;
	}

	public Estado() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
