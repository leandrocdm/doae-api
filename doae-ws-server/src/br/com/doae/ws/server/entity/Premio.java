package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_PREMIO")
@SequenceGenerator(name="premio", sequenceName="S_SIRIO_T_PREMIO", allocationSize=1)
public class Premio {

	@Id
	@GeneratedValue(generator="premio", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_premio")
	private int codigo;
	
	@Column(name="ds_premio", nullable=false)
	private String descricao;
	
	@Column(name="nm_fornecedor")
	private String fornecedor;
	
	@Column(name="ds_acao")
	private String acao;
	
	@Column(name="nr_pontos")
	private double pontos;
	
	@Column(name="st_disponivel")
	private boolean disponivel;

	public Premio() {
		super();
	}

	public Premio(String descricao, String fornecedor, String acao, double pontos, boolean disponivel) {
		super();
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.acao = acao;
		this.pontos = pontos;
		this.disponivel = disponivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}
