package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.dao.PremioDAO;
import br.com.doae.ws.server.entity.Premio;

public class PremioDAOImpl extends GenericDAOImpl<Premio, Integer>
implements PremioDAO{
	
	public PremioDAOImpl(EntityManager em) {
		super(em);
	}

}