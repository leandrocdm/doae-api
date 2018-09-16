package br.com.doae.ws.server.entity;

import java.util.Date;

public class Compra {
	
	private int codigo;
	private int valor;
	private Date dataCompra;
	private StatusCompra status;
	private Usuario usuario;
	private Premio premio;
	
	public Compra() {super();}

	public Compra(int valor, Date dataCompra, StatusCompra status, Usuario usuario, Premio premio) {
		super();
		this.valor = valor;
		this.dataCompra = dataCompra;
		this.status = status;
		this.usuario = usuario;
		this.premio = premio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public StatusCompra getStatus() {
		return status;
	}

	public void setStatus(StatusCompra status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Premio getPremio() {
		return premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}
}
