package br.com.doae.ws.server.entity;

public class Endereco {
	
	private int codigo;
	private String longradouro;
	private int numero;
	private String complemento;
	private String Bairro;
	private long cep;
	private String cidade;
	private String estado;
	private float latitude;
	private float longitude;
	
	public Endereco() {super();}
	
	
	public Endereco(String longradouro, int numero, String complemento, String bairro, long cep, String cidade,
			String estado, float latitude, float longitude) {
		super();
		this.longradouro = longradouro;
		this.numero = numero;
		this.complemento = complemento;
		Bairro = bairro;
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
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
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
