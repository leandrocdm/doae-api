package br.com.doae.ws.server.entity;

import java.util.Date;

public class Usuario {
	
	private int codigo;
	private String apelido;
	private String email;
	private String senha;
	private Date dataNascimento;
	private String nomeUsuario;
	private String sexo;
	private long cpf;
	private String rg;
	private long telefone;
	private byte foto;
	private double peso;
	private int altura;
	private int pontos;
	private Endereco endereco;
	
	public Usuario() {super();}
	
	
	public Usuario(String apelido, String email, String senha, Date dataNascimento, String nomeUsuario,
			String sexo, long cpf, String rg, long telefone, byte foto, double peso, int altura, int pontos,
			Endereco endereco) {
		super();
		this.apelido = apelido;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.nomeUsuario = nomeUsuario;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
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
	

}