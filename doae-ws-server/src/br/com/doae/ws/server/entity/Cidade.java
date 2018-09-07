package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_CIDADE")
@SequenceGenerator(name="cidade", sequenceName="S_SIRIO_T_CIDADE", allocationSize=1)
public class Cidade {

	
	@Id
	@GeneratedValue(generator="cidade", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_cidade")
	private int codigo;
	
	@Column(name="nm_cidade", nullable=false, length=40)
	private String nome;

	public Cidade() {
		super();
	}

	public Cidade(String nome) {
		super();
		this.nome = nome;
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
