package br.com.doae.ws.server.entity;

public class Missao {
	
	private int codigo;
	private String nome;
	private TipoMissao tipoMissao;
	private String descricao;
	private int pontos;
	
	public Missao() {super();}

	public Missao(String nome, TipoMissao tipoMissao, String descricao, int pontos) {
		super();
		this.nome = nome;
		this.tipoMissao = tipoMissao;
		this.descricao = descricao;
		this.pontos = pontos;
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

	public TipoMissao getTipoMissao() {
		return tipoMissao;
	}

	public void setTipoMissao(TipoMissao tipoMissao) {
		this.tipoMissao = tipoMissao;
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
	

}