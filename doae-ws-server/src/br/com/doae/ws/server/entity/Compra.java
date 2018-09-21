package br.com.doae.ws.server.entity;

import java.util.Date;

<<<<<<< Updated upstream:doae-ws-server/src/br/com/doae/ws/server/entity/Compra.java
public class Compra {
	
=======
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

@Entity
@Table(name="T_DOAE_COMPRA")
@SequenceGenerator(name="compra", sequenceName="SQ_DOAE_COMPRA", allocationSize=1)
public class Compra {
	
	@Id
	@Column(name="cd_compra")
	@GeneratedValue(generator="compra", strategy=GenerationType.SEQUENCE)
>>>>>>> Stashed changes:src/br/com/doae/ws/server/entity/Compra.java
	private int codigo;
	private int valor;
	private Date dataCompra;
	private StatusCompra status;
<<<<<<< Updated upstream:doae-ws-server/src/br/com/doae/ws/server/entity/Compra.java
=======
	
	@ManyToOne
	@JoinColumn
>>>>>>> Stashed changes:src/br/com/doae/ws/server/entity/Compra.java
	private Usuario usuario;
	
	@OneToOne(mappedBy="compra")
	private Premio premio;
	
	public Compra() { super(); }

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
