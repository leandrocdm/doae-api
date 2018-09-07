package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_TIPO_MISSAO")
@SequenceGenerator(name="tipoMissao", sequenceName="S_SIRIO_T_TIPO_MISSAO", allocationSize=1)
public class TipoMissao {

	@Id
	@GeneratedValue(generator="tipoMissao", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_tipo_missao")
	private int codigo;
	
	@Column(name="ds_missao", nullable=false, length=500)
	private String missao;
	
	@Column(name="nr_pontos", nullable=false)
	private double pontos;
	
	@Column(name="ds_acao", nullable=false)
	private String acao;
	
	public TipoMissao() {
		super();
	}

	public TipoMissao(String missao, double pontos, String acao) {
		super();
		this.missao = missao;
		this.pontos = pontos;
		this.acao = acao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMissao() {
		return missao;
	}

	public void setMissao(String missao) {
		this.missao = missao;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	
}
