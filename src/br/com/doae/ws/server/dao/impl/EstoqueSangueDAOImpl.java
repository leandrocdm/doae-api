package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.EstoqueSangue;
import br.com.doae.ws.server.dao.EstoqueSangueDAO;

public class EstoqueSangueDAOImpl extends GenericDAOImpl<EstoqueSangue, Integer>
implements EstoqueSangueDAO{
	
	public EstoqueSangueDAOImpl(EntityManager em) {
		super(em);
	}

}