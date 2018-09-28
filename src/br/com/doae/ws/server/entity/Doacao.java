package br.com.doae.ws.server.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
    @ManyToOne
    @JoinColumn(name = "cd_hemocentro")
	private Hemocentro hemocentro;
	
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;
	
	public Doacao() { super(); }
	
	public Doacao(Date data) {
		super();
		this.data = data;
	}

	public Doacao(Date data, Hemocentro hemocentro, Usuario usuario) {
		super();
		this.data = data;
		this.hemocentro = hemocentro;
		this.usuario = usuario;
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
}