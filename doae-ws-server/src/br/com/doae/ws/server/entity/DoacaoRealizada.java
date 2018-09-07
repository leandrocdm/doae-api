package br.com.doae.ws.server.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="T_SIRIO_DOACAO_REALIZADA")
@SequenceGenerator(name="doacaoRealizada", sequenceName="S_SIRIO_T_DOACAO_REALIZADA", allocationSize=1)
public class DoacaoRealizada {

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_doacao")
	private Calendar dataDoacao;

	public DoacaoRealizada() {
		super();
	}

	public DoacaoRealizada(Calendar dataDoacao) {
		super();
		this.dataDoacao = dataDoacao;
	}

	public Calendar getDataDoacao() {
		return dataDoacao;
	}

	public void setDataDoacao(Calendar dataDoacao) {
		this.dataDoacao = dataDoacao;
	}
}
