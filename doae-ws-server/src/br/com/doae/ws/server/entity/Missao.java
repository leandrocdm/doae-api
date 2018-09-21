package br.com.doae.ws.server.entity;

public class Missao {
	
<<<<<<< Updated upstream:doae-ws-server/src/br/com/doae/ws/server/entity/Missao.java
	private int codigo;
=======
	@Id
	@Column(name="cd_missao")
	@GeneratedValue(generator="missao", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_missao", nullable=false)
>>>>>>> Stashed changes:src/br/com/doae/ws/server/entity/Missao.java
	private String nome;
	private TipoMissao tipoMissao;
<<<<<<< Updated upstream:doae-ws-server/src/br/com/doae/ws/server/entity/Missao.java
=======
	
	@Column(name="ds_descricao", nullable=false)
>>>>>>> Stashed changes:src/br/com/doae/ws/server/entity/Missao.java
	private String descricao;
	private int pontos;
	
	public Missao() { super(); }

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