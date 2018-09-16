package br.com.doae.ws.server.entity;

import java.util.Date;

public class Movimentacao {
	
	private int codigo;
	private CategoriaMovimentacao catMovimentacao;
	private TipoMovimentacao tipoMovimentacao;
	private int valor;
	private Date data;
	private int pontuacaoAnterior;
	private Usuario usuario;
	
	public Movimentacao() {super();}

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
