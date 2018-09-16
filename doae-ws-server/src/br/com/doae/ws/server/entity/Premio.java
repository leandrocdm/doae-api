package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_PREMIO")
@SequenceGenerator(name="premio", sequenceName="SQ_DOAE_PREMIO", allocationSize=1)
public class Premio {

	@Id
	@Column(name="cd_codigo")
	@GeneratedValue(generator="premio", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_nome", nullable=false)
	private String nome;
	
	@Column(name="tx_descricao", nullable=false)
	private String descricao;
	
	@Column(name="vl_pontos")
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
