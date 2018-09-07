package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="T_SIRIO_AMIGO")
@SequenceGenerator(name="amigo", sequenceName="SQ_SIRIO_T_AMIGO", allocationSize=1)
public class Amigo {

	@Id
	@GeneratedValue (generator="amigo", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_amigo")
	private int codigo;
	
	
	private Usuario usuario;

	public Amigo() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
