package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_BANCO_SANGUE")
@SequenceGenerator(name="bancoSangue", sequenceName="S_SIRIO_T_BANCO_SANGUE", allocationSize=1)
public class BancoSangue {

	@Id
	@GeneratedValue(generator="bancoSangue", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_banco_sangue")
	private int codigo;
	
	@Column(name="tp_sangue", nullable=false, length=100)
	private int sangue;
	private long qtiSangue;

	public BancoSangue() {
		super();
	}

	public BancoSangue(int codigoCentroDoacao, int sangue, long qtiSangue) {
		super();
		this.sangue = sangue;
		this.qtiSangue = qtiSangue;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSangue() {
		return sangue;
	}

	public void setSangue(int sangue) {
		this.sangue = sangue;
	}

	public long getQtiSangue() {
		return qtiSangue;
	}

	public void setQtiSangue(long qtiSangue) {
		this.qtiSangue = qtiSangue;
	}

}
