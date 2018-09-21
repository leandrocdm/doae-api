package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Sangue;
import br.com.doae.ws.server.dao.SangueDAO;

public class SangueDAOImpl extends GenericDAOImpl<Sangue, Integer>
implements SangueDAO{
	
	public SangueDAOImpl(EntityManager em) {
		super(em);
	}

}