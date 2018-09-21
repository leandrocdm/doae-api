package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.dao.ParceiroDAO;

public class PremioDAOImpl extends GenericDAOImpl<Parceiro, Integer>
implements ParceiroDAO{
	
	public PremioDAOImpl(EntityManager em) {
		super(em);
	}

}