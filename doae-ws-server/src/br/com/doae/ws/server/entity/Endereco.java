package br.com.doae.ws.server.entity;

<<<<<<< Updated upstream:doae-ws-server/src/br/com/doae/ws/server/entity/Endereco.java
public class Endereco {
	
	private int codigo;
	private String longradouro;
	private int numero;
	private String complemento;
	private String Bairro;
	private long cep;
	private String cidade;
=======
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
@Table(name="T_DOAE_ENDERECO")
@SequenceGenerator(name="endereco", sequenceName="SQ_DOAE_ENDERECO")
public class Endereco {
	
	@Id
	@Column(name="cd_endereco")
	@GeneratedValue(generator="endereco", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_longradouro", nullable=false)
	private String longradouro;
	
	@Column(name="nr_numero", nullable=false)
	private int numero;
	
	@Column(name="ds_complemento")
	private String complemento;
	
	@Column(name="ds_bairro", nullable=false)
	private String bairro;
	
	@Column(name="ds_cep", nullable=false)
	private long cep;
	
	@Column(name="ds_cidade", nullable=false)
	private String cidade;
	
	@Column(name="ds_estado", nullable=false)
>>>>>>> Stashed changes:src/br/com/doae/ws/server/entity/Endereco.java
	private String estado;
	private float latitude;
	private float longitude;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_parceiro")
	private Parceiro parceiro;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_hemocentro")
	private Hemocentro hemocentro;
	
	public Endereco() { super(); }

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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}
}
