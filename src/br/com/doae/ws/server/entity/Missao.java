package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_MISSAO")
@SequenceGenerator(name="missao", sequenceName="SQ_DOAE_MISSAO", allocationSize=1)
public class Missao {
	
	@Id
	@Column(name="cd_codigo")
	@GeneratedValue(generator="missao", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="tx_nome", nullable=false)
	private String nome;
	
	@Enumerated
	@Column(name="tp_missao", nullable=false)
	private TipoMissao tipoMissao;
	
	@Column(name="tx_descricao", nullable=false)
	private String descricao;
	
	@Column(name="vl_pontos")
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