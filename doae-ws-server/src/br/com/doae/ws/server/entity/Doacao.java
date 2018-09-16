package br.com.doae.ws.server.entity;

import java.util.Date;

public class Doacao {

	private int codigo;
	private Hemocentro hemocentro;
	private Usuario usuario;
	private Date dataDoacao;

	public Doacao() {super();}

	public Doacao(Hemocentro hemocentro, Usuario usuario, Date dataDoacao) {
		super();
		this.hemocentro = hemocentro;
		this.usuario = usuario;
		this.dataDoacao = dataDoacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Hemocentro getHemocentro() {
		return hemocentro;
	}

	public void setHemocentro(Hemocentro hemocentro) {
		this.hemocentro = hemocentro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataDoacao() {
		return dataDoacao;
	}

	public void setDataDoacao(Date dataDoacao) {
		this.dataDoacao = dataDoacao;
	}

}
