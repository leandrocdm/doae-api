package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_SIRIO_CENTRO_DOACAO")
@SequenceGenerator(name="centroDoacao", sequenceName="S_SIRIO_T_CENTRO_DOACAO", allocationSize=1)
public class CentroDoacao {

	@Id
	@GeneratedValue(generator="centroDoacao", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_centro_doacao")
	private int codigo;
	
	@Column(name="nm_centro_doacao", nullable=false, length=150)
	private String nome;
	
	@Column(name="ds_lagradouro", length=100)
	private String logradouro;
	
	@Column(name="nr_logradouro", length=5)
	private String numero;
	
	@Column(name="nr_complemento", length=50)
	private String complemento;		
	
	@Column(name="ds_bairro", length=50)
	private String bairro;
	
	@Column(name="ds_cep")
	private String CEP;
	
	@Column(name="nr_telefone", length=25)
	private String telefone;
	
	@Column(name="ds_email", length=200)
	private String email;

	public CentroDoacao() {
		super();
	}

	public CentroDoacao(String nome, String logradouro, String numero, String complemento, String bairro, String cEP,
			String telefone, String email) {
		super();
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		CEP = cEP;
		this.telefone = telefone;
		this.email = email;
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

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
