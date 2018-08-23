package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_USUARIO")
@SequenceGenerator(sequenceName="SQ_DOAE_USUARIO", allocationSize=1, name="codigo")
public class Usuario {
	
	@Id
	@Column(name="cd_usuario")
	@GeneratedValue(generator="codigo", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_usuario", nullable=false)
	private String nome;
	
	@Column(name="nm_apelido", nullable=false)
	private String apelido;
	
	public Usuario() {super();}
	
	public Usuario(String nome, String apelido) {
		super();
		this.nome = nome;
		this.apelido = apelido;
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
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	

}
