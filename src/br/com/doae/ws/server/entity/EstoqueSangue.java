package br.com.doae.ws.server.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	private int qtdMaxima;
	private int qtdAtual;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_sangue")
	private Sangue sangue;
	
	@ManyToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	@JoinTable(name="T_DOAE_HEMOCENTRO", joinColumns=@JoinColumn(name="cd_est_sangue"), inverseJoinColumns=@JoinColumn(name="cd_hemocentro"))
	private List<Hemocentro> hemocentros;
	
	public EstoqueSangue() { super(); }

	public EstoqueSangue(int qtdMaxima, int qtdAtual, Sangue sangue, List<Hemocentro> hemocentros) {
		super();
		this.qtdMaxima = qtdMaxima;
		this.qtdAtual = qtdAtual;
		this.sangue = sangue;
		this.hemocentros = hemocentros;
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

	public List<Hemocentro> getHemocentros() {
		return hemocentros;
	}

	public void setHemocentros(List<Hemocentro> hemocentros) {
		this.hemocentros = hemocentros;
	}
}
