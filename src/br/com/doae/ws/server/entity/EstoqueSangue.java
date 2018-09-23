package br.com.doae.ws.server.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_EST_SANGUE")
@IdClass(SangueHemocentroPK.class)
@SequenceGenerator(name="estoqueSangue", sequenceName="SQ_DOAE_EST_SANGUE", allocationSize=1)
public class EstoqueSangue {

	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_estoqueSangue")
	private int codigo;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_sangue")
	private Sangue sangue;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_hemocentro")
	private Hemocentro hemocentro;
	
	@Column(name="qt_maxima", nullable=false)
	private int qtdMaxima;
	
	@Column(name="qt_atual", nullable=false)
	private int qtdAtual;
	
	public EstoqueSangue() {super(); }

	public EstoqueSangue(Sangue sangue, Hemocentro hemocentro, int qtdMaxima, int qtdAtual) {
		super();
		this.sangue = sangue;
		this.hemocentro = hemocentro;
		this.qtdMaxima = qtdMaxima;
		this.qtdAtual = qtdAtual;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Sangue getSangue() {
		return sangue;
	}

	public void setSangue(Sangue sangue) {
		this.sangue = sangue;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public int getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(int qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
}