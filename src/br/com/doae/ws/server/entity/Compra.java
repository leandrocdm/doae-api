package br.com.doae.ws.server.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_DOAE_COMPRA")
@SequenceGenerator(name="compra", sequenceName="SQ_DOAE_COMPRA", allocationSize=1)
public class Compra {
	
	@Id
	@Column(name="cd_compra")
	@GeneratedValue(generator="compra", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="vl_compra", nullable=false)
	private int valor;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_compra", nullable=false)
	private Date data;
	
	@Enumerated
	@Column(name="st_compra")
	private StatusCompra status;
	
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;
		
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_premio")
	private Premio premio;
	
	public Compra() { super(); }

	public Compra(int valor, Date data, StatusCompra status) {
		super();
		this.valor = valor;
		this.data = data;
		this.status = status;
	}

	public Compra(int valor, Date data, StatusCompra status, Usuario usuario, Premio premio) {
		super();
		this.valor = valor;
		this.data = data;
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

	public Date getdata() {
		return data;
	}

	public void setdata(Date data) {
		this.data = data;
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
