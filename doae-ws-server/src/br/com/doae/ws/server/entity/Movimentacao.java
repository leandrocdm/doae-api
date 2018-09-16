package br.com.doae.ws.server.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_DOAE_MOVIMENTACAO")
@SequenceGenerator(name="movimentacao", sequenceName="SQ_DOAE_MOVIMENTACAO", allocationSize=1)
public class Movimentacao {
	
	@Id
	@Column(name="cd_codigo")
	@GeneratedValue(generator="movimentacao", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Enumerated
	@Column(name="tx_categoria", nullable=false)
	private CategoriaMovimentacao categoria;
	
	@Enumerated
	@Column(name="tx_tipo", nullable=false)
	private TipoMovimentacao tipo;
	private int valor;
	private Date data;
	private int pontuacaoAnterior;
	private Usuario usuario;
	
	public Movimentacao() {super();}

	public Movimentacao(CategoriaMovimentacao categoria, TipoMovimentacao tipo, int valor, Date data,
			int pontuacaoAnterior, Usuario usuario) {
		super();
		this.categoria = categoria;
		this.tipo = tipo;
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
