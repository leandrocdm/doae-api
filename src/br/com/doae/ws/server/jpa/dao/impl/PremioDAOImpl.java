package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.jpa.dao.ParceiroDAO;

public class PremioDAOImpl extends GenericDAOImpl<Parceiro, Integer>
implements ParceiroDAO{
	
	public PremioDAOImpl(EntityManager em) {
		super(em);
	}

}