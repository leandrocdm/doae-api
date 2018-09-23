package br.com.doae.ws.server.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_PARCEIRO")
@SequenceGenerator(name="parceiro", sequenceName="SQ_DOAE_PARCEIRO", allocationSize=1)
public class Parceiro {

	@Id
	@Column(name="cd_parceiro")
	@GeneratedValue(generator="parceiro", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_parceiro", nullable=false)
	private String nome;
	
	@Column(name="nr_telefone", nullable=false)
	private long telefone;
	
	@Column(name="ds_email", nullable=false)
	private String email;
	
	@Column(name="st_ativo", nullable=false)
	private boolean ativo;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_endereco")
	private Endereco endereco;

	public Parceiro() {super();}

	public Parceiro(String nome, long telefone, String email, boolean ativo, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.ativo = ativo;
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

	public void setTelefone(long numero) {
		this.telefone = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}