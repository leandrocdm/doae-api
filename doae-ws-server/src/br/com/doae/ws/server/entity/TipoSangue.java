package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_TIPO_SANGUE")
@SequenceGenerator(name="tipoSangue", sequenceName="S_SIRIO_T_TIPO_SANGUE", allocationSize=1)
public class TipoSangue {

	@Id
	@GeneratedValue(generator="tipoSangue", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_tipo_sangue")
	private int codigo;
	
	@Column(name="ds_tipo_sangue")
	private String descricao;

	public TipoSangue() {
		super();
	}

	public TipoSangue(String descricao) {
		super();
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
