package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_HEMOCENTRO")
@SequenceGenerator(name="hemocentro", sequenceName="SQ_DOAE_HEMOCENTRO", allocationSize=1)
public class Hemocentro {

	@Id
	@Column(name="cd_codigo")
	@GeneratedValue(generator="hemocentro", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="tx_nome", nullable=false)
	private String nome;
	
	@Column(name="nr_telefone", nullable=false)
	private long telefone;
	
	@Column(name="ds_email", nullable=false)
	private String email;
	
	private Endereco endereco;

	public Hemocentro() {super();}

	public Hemocentro(String nome, long telefone, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
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

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
