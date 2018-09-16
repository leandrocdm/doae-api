package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.EstoqueSangue;
import br.com.doae.ws.server.jpa.dao.EstoqueSangueDAO;

public class EstoqueSangueDAOImpl extends GenericDAOImpl<EstoqueSangue, Integer>
implements EstoqueSangueDAO{
	
	public EstoqueSangueDAOImpl(EntityManager em) {
		super(em);
	}

}