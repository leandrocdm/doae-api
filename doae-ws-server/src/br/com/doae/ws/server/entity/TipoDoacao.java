package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_TIPO_DOACAO")
@SequenceGenerator(name="tipoDoacao", sequenceName="S_SIRIO_T_TIPO_DOACAO", allocationSize=1)
public class TipoDoacao {

	@Id
	@GeneratedValue(generator="tipoDoacao", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_tipo_doacao")
	private int codigo;
	
	@Column(name="ds_tipo_doacao", nullable=false, length=8)
	private String descricao;

	public TipoDoacao() {
		super();
	}

	public TipoDoacao(String descricao) {
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
