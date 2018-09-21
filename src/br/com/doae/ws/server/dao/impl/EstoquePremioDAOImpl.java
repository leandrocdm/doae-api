package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.EstoquePremio;
import br.com.doae.ws.server.dao.EstoquePremioDAO;

public class EstoquePremioDAOImpl extends GenericDAOImpl<EstoquePremio, Integer>
implements EstoquePremioDAO{
	
	public EstoquePremioDAOImpl(EntityManager em) {
		super(em);
	}

}