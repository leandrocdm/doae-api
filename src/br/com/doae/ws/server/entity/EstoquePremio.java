package br.com.doae.ws.server.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_EST_PREMIO")
@SequenceGenerator(name="estoquePremio", sequenceName="SQ_DOAE_EST_PREMIO", allocationSize=1)
public class EstoquePremio {
	
	@Id
	@Column(name="cd_est_premio")
	@GeneratedValue(generator="estoquePremio", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="qt_quantidade", nullable=false)
	private int quantidade;
		
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_premio")
	private Premio premio;

	public EstoquePremio() { super(); }
	
	public EstoquePremio(int quantidade) {
		super();
		this.quantidade = quantidade;
	}

	public EstoquePremio(int quantidade, Premio premio) {
		super();
		this.quantidade = quantidade;
		this.premio = premio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}
}
