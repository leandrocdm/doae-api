package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Sangue;
import br.com.doae.ws.server.jpa.dao.SangueDAO;

public class SangueDAOImpl extends GenericDAOImpl<Sangue, Integer>
implements SangueDAO{
	
	public SangueDAOImpl(EntityManager em) {
		super(em);
	}

}