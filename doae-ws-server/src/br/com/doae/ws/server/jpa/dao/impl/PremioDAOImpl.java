package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Premio;
import br.com.doae.ws.server.jpa.dao.PremioDAO;

public class PremioDAOImpl extends GenericDAOImpl<Premio, Integer> implements PremioDAO{

	public PremioDAOImpl(EntityManager em) {
		super(em);
	}

}
