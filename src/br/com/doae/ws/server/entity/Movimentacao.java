package br.com.doae.ws.server.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_categoria_mov", nullable=false)
	private CategoriaMovimentacao catMovimentacao;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo_mov", nullable=false)
	private TipoMovimentacao tipoMovimentacao;
	
	@Column(name="vl_movimentacao", nullable=false)
	private int valor;
	
	@Column(name="dt_movimentacao", nullable=false)
	private Date data;
	
	@Column(name="vl_pontuacao_anterior", nullable=false)
	private int pontuacaoAnterior;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	private Usuario usuario;
	
	public Movimentacao() {super();}
	
	public Movimentacao(CategoriaMovimentacao catMovimentacao, TipoMovimentacao tipoMovimentacao, int valor, Date data,
			int pontuacaoAnterior) {
		super();
		this.catMovimentacao = catMovimentacao;
		this.tipoMovimentacao = tipoMovimentacao;
		this.valor = valor;
		this.data = data;
		this.pontuacaoAnterior = pontuacaoAnterior;
	}

	public Movimentacao(CategoriaMovimentacao catMovimentacao, TipoMovimentacao tipoMovimentacao, int valor, Date data,
			int pontuacaoAnterior, Usuario usuario) {
		super();
		this.catMovimentacao = catMovimentacao;
		this.tipoMovimentacao = tipoMovimentacao;
		this.valor = valor;
		this.data = data;
		this.pontuacaoAnterior = pontuacaoAnterior;
		this.usuario = usuario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public CategoriaMovimentacao getCatMovimentacao() {
		return catMovimentacao;
	}

	public void setCatMovimentacao(CategoriaMovimentacao catMovimentacao) {
		this.catMovimentacao = catMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
