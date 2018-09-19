package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_EST_PREMIO")
@SequenceGenerator(name="estoquePremio", sequenceName="SQ_DOAE_EST_PREMIO", allocationSize=1)
public class EstoquePremio {
	
	@Id
	@GeneratedValue(generator="estoquePremio", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="vl_quantidade", nullable=false)
	private int quantidade;
	private Premio premio;

	public EstoquePremio() {super();}

	public EstoquePremio(Premio premio, int quantidade) {
		super();
		this.premio = premio;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
