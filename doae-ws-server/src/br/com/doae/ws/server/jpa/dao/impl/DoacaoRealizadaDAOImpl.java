package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.DoacaoRealizada;
import br.com.doae.ws.server.jpa.dao.DoacaoRealizadaDAO;

public class DoacaoRealizadaDAOImpl extends GenericDAOImpl<DoacaoRealizada, Integer> implements DoacaoRealizadaDAO{

	public DoacaoRealizadaDAOImpl(EntityManager em) {
		super(em);
	}

}
