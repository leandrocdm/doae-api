package br.com.doae.ws.server.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_MOVIMENTACAO")
@SequenceGenerator(name="movimentacao", sequenceName="SQ_DOAE_MOVIMENTACAO", allocationSize=1)
public class Movimentacao {
	
	@Id
	@Column(name="cd_movimentacao")
	@GeneratedValue(generator="movimentacao", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Enumerated
	@Column(name="ds_categoria", nullable=false)
	private CategoriaMovimentacao categoria;
	
	@Enumerated
	@Column(name="ds_tipo", nullable=false)
	private TipoMovimentacao tipo;
	
	@ManyToOne
	@JoinColumn
	private Usuario usuario;
	
	@Column(name="vl_movimentacao", nullable=false)
	private int valor;	
	
	@Column(name="dt_movimentacao", nullable=false)
	private Date data;
	
	@Column(name="vl_anterior", nullable=false)
	private int pontuacaoAnterior;
	
	public Movimentacao() { super(); }

	public Movimentacao(CategoriaMovimentacao categoria, TipoMovimentacao tipo, Usuario usuario, int valor, Date data,
			int pontuacaoAnterior) {
		super();
		this.categoria = categoria;
		this.tipo = tipo;
		this.usuario = usuario;
		this.valor = valor;
		this.data = data;
		this.pontuacaoAnterior = pontuacaoAnterior;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public CategoriaMovimentacao getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaMovimentacao categoria) {
		this.categoria = categoria;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getPontuacaoAnterior() {
		return pontuacaoAnterior;
	}

	public void setPontuacaoAnterior(int pontuacaoAnterior) {
		this.pontuacaoAnterior = pontuacaoAnterior;
	}
}
