package br.com.doae.ws.server.entity;

public class Cidade {

	private int codigo;
	private String nome;

	public Cidade() {
		super();
	}

	public Cidade(String nome) {
		super();
		this.nome = nome;
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
