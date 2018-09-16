package br.com.doae.ws.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_ENDERECO")
@SequenceGenerator(name="endereco", sequenceName="SQ_DOAE_ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(generator="endereco", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="tx_longradouro", nullable=false)
	private String longradouro;
	
	@Column(name="vl_numero", nullable=false)
	private int numero;
	
	@Column(name="tx_complemento")
	private String complemento;
	
	@Column(name="tx_bairro", nullable=false)
	private String bairro;
	
	@Column(name="cd_cep", nullable=false)
	private long cep;
	
	@Column(name="tx_cidade", nullable=false)
	private String cidade;
	
	@Column(name="tx_estado", nullable=false)
	private String estado;
	
	@Column(name="cd_latitude")
	private float latitude;
	
	@Column(name="cd_longitude")
	private float longitude;
	
	public Endereco() {super();}
	
	
	public Endereco(String longradouro, int numero, String complemento, String bairro, long cep, String cidade,
			String estado, float latitude, float longitude) {
		super();
		this.longradouro = longradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLongradouro() {
		return longradouro;
	}
	public void setLongradouro(String longradouro) {
		this.longradouro = longradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
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
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}
