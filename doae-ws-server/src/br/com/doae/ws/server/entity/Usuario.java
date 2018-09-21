package br.com.doae.ws.server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
	private String apelido;
	
	@Column(name="nm_usuario")
	private String nome;
	
	@Column(name="ds_senha", nullable=false)
	private String senha;
	
	@Column(name="ds_email", nullable=false)
	private String email;
		
	@Column(name="dt_nascimento")
	private Date dataNascimento;
		
	@Column(name="ds_sexo")
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@Column(name="ds_cpf")
	private long cpf;
	private String rg;
	private long telefone;
	private byte foto;
	private double peso;
	private int altura;
	private int pontos;
	
	@OneToOne(mappedBy="usuario")
	private Endereco endereco;
		
	@OneToMany(mappedBy="usuario", cascade = CascadeType.PERSIST)
	private List<Compra> compras = new ArrayList<>();
	
	@OneToMany(mappedBy="usuario", cascade = CascadeType.PERSIST)
	private List<Movimentacao> movimentacoes = new ArrayList<>();
	
	@ManyToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	@JoinTable(name="T_DOAE_DOACAO", joinColumns=@JoinColumn(name="cd_usuario"), inverseJoinColumns=@JoinColumn(name="cd_doacao"))
	private List<Doacao> doacoes;
	
	public Usuario() { super(); }

	public Usuario(String apelido, String nome, String senha, String email, Date dataNascimento, Sexo sexo, long cpf,
			String rg, long telefone, byte foto, double peso, int altura, int pontos, Endereco endereco,
			List<Compra> compras, List<Movimentacao> movimentacoes, List<Doacao> doacoes) {
		super();
		this.apelido = apelido;
		this.nome = nome;
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
		this.compras = compras;
		this.movimentacoes = movimentacoes;
		this.doacoes = doacoes;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public byte getFoto() {
		return foto;
	}

	public void setFoto(byte foto) {
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

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
}