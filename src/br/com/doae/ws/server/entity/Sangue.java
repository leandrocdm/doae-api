package br.com.doae.ws.server.entity;

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
@Table(name="T_DOAE_SANGUE")
@SequenceGenerator(name="sangue", sequenceName="SQ_DOAE_SANGUE", allocationSize=1)
public class Sangue {
	
	@Id
	@Column(name="cd_sangue")
	@GeneratedValue(generator="sangue", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_tipo_sangue")
	private TipoSangue tipoSangue;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_fator_rh")
	private FatorRH fator;
	
	@OneToOne(mappedBy="sangue")
	private EstoqueSangue estoque;
	
	@OneToOne(mappedBy="sangue")
	private Usuario usuario;
	
	public Sangue() { super(); }

	public Sangue(TipoSangue tipoSangue, FatorRH fator) {
		super();
		this.tipoSangue = tipoSangue;
		this.fator = fator;
	}
	
	public Sangue(TipoSangue tipoSangue, FatorRH fator, EstoqueSangue estoque) {
		super();
		this.tipoSangue = tipoSangue;
		this.fator = fator;
		this.estoque = estoque;
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

	public EstoqueSangue getEstoque() {
		return estoque;
	}

	public void setEstoque(EstoqueSangue estoque) {
		this.estoque = estoque;
	}
}