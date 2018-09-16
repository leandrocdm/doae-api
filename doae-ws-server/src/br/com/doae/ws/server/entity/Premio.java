package br.com.doae.ws.server.entity;

public class Premio {

	private int codigo;
	private String nome;
	private String descricao;
	private int pontos;
	private Parceiro parceiro;

	public Premio() {super();}

	public Premio(String nome, String descricao, int pontos, Parceiro parceiro) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.pontos = pontos;
		this.parceiro = parceiro;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public Parceiro getParceiro() {
		return parceiro;
	}
	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}
}
