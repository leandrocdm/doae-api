package br.com.doae.ws.server.entity;

public class Parceiro {

	private int codigo;
	private String nome;
	private long numero;
	private String email;
	private boolean ativo;
	private Endereco endereco;

	public Parceiro() {super();}

	public Parceiro(String nome, long numero, String email, boolean ativo, Endereco endereco) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.email = email;
		this.ativo = ativo;
		this.endereco = endereco;
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

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}