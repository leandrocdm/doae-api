package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.TipoDoacao;
import br.com.doae.ws.server.jpa.dao.TipoDoacaoDAO;

public class TipoDoacaoDAOImpl extends GenericDAOImpl<TipoDoacao, Integer> implements TipoDoacaoDAO{

	public TipoDoacaoDAOImpl(EntityManager em) {
		super(em);
	}

}
