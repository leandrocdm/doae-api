package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_ESTADO")
@SequenceGenerator(name="estado", sequenceName="S_SIRIO_T_ESTADO", allocationSize=1)
public class Estado {

	@Id
	@GeneratedValue(generator="estado", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_estado")
	private int codigo;
	
	@Column(name="nm_estado")
	private String nome;

	public Estado(String nome) {
		super();
		this.nome = nome;
	}

	public Estado() {
		super();
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

}
