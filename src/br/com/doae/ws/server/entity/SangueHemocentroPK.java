package br.com.doae.ws.server.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SangueHemocentroPK implements Serializable {
	
	private int codigo;

	private int sangue;
	
	private int hemocentro;
	
	public SangueHemocentroPK() { super();}
	
	public SangueHemocentroPK(int sangue, int hemocentro) {
		super();
		this.sangue = sangue;
		this.hemocentro = hemocentro;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getSangue() {
		return this.sangue;
	}
	
	public void setSangue(int sangue) {
		this.sangue = sangue;
	}
	
	public int getHemocentro() {
		return this.hemocentro;
	}
	
	public void setHemocentro(int hemocentro) {
		this.hemocentro = hemocentro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + hemocentro;
		result = prime * result + sangue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SangueHemocentroPK other = (SangueHemocentroPK) obj;
		if (codigo != other.codigo)
			return false;
		if (hemocentro != other.hemocentro)
			return false;
		if (sangue != other.sangue)
			return false;
		return true;
	}
	
}
