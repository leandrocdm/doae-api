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
@Table(name="T_DOAE_EST_SANGUE")
@SequenceGenerator(name="estoqueSangue", sequenceName="SQ_DOAE_EST_SANGUE", allocationSize=1)
public class EstoqueSangue {
	
	@Id
	@Column(name="cd_est_sangue")
	@GeneratedValue(generator="estoqueSangue", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="qt_maxima", nullable=false)
	private int qtdMaxima;
	
	@Column(name="qt_atual", nullable=false)
	private int qtdAtual;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_sangue")
	private Sangue sangue;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_hemocentro")
	private Hemocentro hemocentro;
	
	public EstoqueSangue() { super(); }
	
	public EstoqueSangue(int qtdMaxima, int qtdAtual) {
		super();
		this.qtdMaxima = qtdMaxima;
		this.qtdAtual = qtdAtual;
	}

	public EstoqueSangue(int qtdMaxima, int qtdAtual, Sangue sangue, Hemocentro hemocentro) {
		super();
		this.qtdMaxima = qtdMaxima;
		this.qtdAtual = qtdAtual;
		this.sangue = sangue;
		this.hemocentro = hemocentro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
}
