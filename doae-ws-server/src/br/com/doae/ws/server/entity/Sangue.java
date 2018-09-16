package br.com.doae.ws.server.entity;

public class Sangue {

	private int codigo;
	private TipoSangue tipoSangue;
	private FatorRH fator;

	public Sangue() {super();}

	public Sangue(TipoSangue tipoSangue, FatorRH fator) {
		super();
		this.tipoSangue = tipoSangue;
		this.fator = fator;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public TipoSangue getTipoSangue() {
		return tipoSangue;
	}

	public void setTipoSangue(TipoSangue tipoSangue) {
		this.tipoSangue = tipoSangue;
	}

	public FatorRH getFator() {
		return fator;
	}

	public void setFator(FatorRH fator) {
		this.fator = fator;
	}
}
