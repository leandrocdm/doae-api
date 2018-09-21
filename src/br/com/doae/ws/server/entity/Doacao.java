package br.com.doae.ws.server.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_DOAE_DOACAO")
@SequenceGenerator(name="doacao", sequenceName="SQ_DOAE_DOACAO", allocationSize=1)
public class Doacao {

	@Id
	@GeneratedValue(generator="doacao", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_doacao")
	private int codigo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_doacao", nullable=false)
	private Date data;
	
	@ManyToMany(mappedBy="doacoes")
	private List<Hemocentro> hemocentros;
	
	@ManyToMany(mappedBy="doacoes")
	private List<Usuario> usuarios;
	
	public Doacao() { super(); }

	public Doacao(Date data, List<Hemocentro> hemocentros, List<Usuario> usuarios) {
		super();
		this.data = data;
		this.hemocentros = hemocentros;
		this.usuarios = usuarios;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Hemocentro> getHemocentros() {
		return hemocentros;
	}

	public void setHemocentros(List<Hemocentro> hemocentros) {
		this.hemocentros = hemocentros;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
