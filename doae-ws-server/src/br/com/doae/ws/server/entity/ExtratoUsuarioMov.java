package br.com.doae.ws.server.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_SIRIO_EXTRATO_USUARIO_MOV")
@SequenceGenerator(name="extratoUsuarioMov", sequenceName="S_SIRIO_T_EXTRATO_USUARIO_MOV", allocationSize=1)
public class ExtratoUsuarioMov {

	@Id
	@GeneratedValue(generator="extratoUsuarioMov", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_extrato_usuario_mov")
	private int codigo;
	
	@Column(name="cd_item", nullable=false)
	private int codigoItem; 
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_acao")
	private Calendar data;
	
	@Column(name="tp_acao")
	private char tipoAcao;
	
	@Column(name="nr_pontos")
	private double pontos;

	public ExtratoUsuarioMov() {
		super();
	}

	public ExtratoUsuarioMov(int extrato1, int codigoItem, Calendar data, char tipoAcao, double pontos) {
		super();
		this.codigoItem = codigoItem;
		this.data = data;
		this.tipoAcao = tipoAcao;
		this.pontos = pontos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public char getTipoAcao() {
		return tipoAcao;
	}

	public void setTipoAcao(char tipoAcao) {
		this.tipoAcao = tipoAcao;
	}

	public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos = pontos;
	}

}
