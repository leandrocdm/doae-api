package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_EXTRATO_USUARIO")
@SequenceGenerator(name="extraoUsuario", sequenceName="S_SIRIO_T_ESTRATO_USUARIO", allocationSize=1)
public class ExtratoUsuario {

	@Id
	@GeneratedValue(generator="extraoUsuario", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_extrato_usuario")
	private int codigo;
	
	@Column(name="tl_pontos")
	private double totalPontos;

	public ExtratoUsuario() {
		super();
	}

	public ExtratoUsuario(double totalPontos) {
		super();
		this.totalPontos = totalPontos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(double totalPontos) {
		this.totalPontos = totalPontos;
	}

}
