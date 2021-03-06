package br.com.doae.ws.server.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_USUARIO")
@SequenceGenerator(name="usuario", sequenceName="SQ_DOAE_USUARIO", allocationSize=1)
public class Usuario {

	@Id
	@Column(name="cd_usuario")
	@GeneratedValue(generator="usuario", strategy=GenerationType.SEQUENCE)
	private int codigo;

	@Column(name="nm_apelido", nullable=false)
	private String apelido;

	@Column(name="nm_usuario")
	private String usuario;

	@Column(name="ds_senha", nullable=false)
	private String senha;

	@Column(name="ds_email", nullable=false, unique=true)
	private String email;

	@Column(name="dt_nascimento")
	private Date dataNascimento;

	@Column(name="ds_sexo")
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Column(name="ds_cpf")
	private long cpf;

	@Column(name="ds_rg")
	private String rg;

	@Column(name="nr_telefone")
	private long telefone;

	@Lob
	@Column(name="fl_foto")
	private byte[] foto;

	@Column(name="vl_peso")
	private double peso;

	@Column(name="vl_altura")
	private int altura;

	@Column(name="qt_pontos", nullable=false)
	private int pontos;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_endereco", unique = true)
	private Endereco endereco;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_sangue")
	private Sangue sangue;
	
	public Usuario() { super(); }
	
	public Usuario(String apelido, String senha, String email) {
		super();
		this.apelido = apelido;
		this.senha = senha;
		this.email = email;
	}

	public Usuario(String apelido, String usuario, String senha, String email, int pontos) {
		super();
		this.apelido = apelido;
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
		this.pontos = pontos;
	}

	public Usuario(String apelido, String usuario, String senha, String email, Date dataNascimento, Sexo sexo, long cpf,
			String rg, long telefone, byte[] foto, double peso, int altura, int pontos, Endereco endereco) {
		super();
		this.apelido = apelido;
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.foto = foto;
		this.peso = peso;
		this.altura = altura;
		this.pontos = pontos;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Sangue getSangue() {
		return sangue;
	}

	public void setSangue(Sangue sangue) {
		this.sangue = sangue;
	}
}