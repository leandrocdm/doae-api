package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.TipoSangue;
import br.com.doae.ws.server.jpa.dao.TipoSangueDAO;

public class TipoSangueDAOImpl extends GenericDAOImpl<TipoSangue, Integer> implements TipoSangueDAO{

	public TipoSangueDAOImpl(EntityManager em) {
		super(em);
	}

}
