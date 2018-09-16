package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Parceiro;
import br.com.doae.ws.server.jpa.dao.ParceiroDAO;

public class ParceiroDAOImpl extends GenericDAOImpl<Parceiro, Integer>
implements ParceiroDAO{
	
	public ParceiroDAOImpl(EntityManager em) {
		super(em);
	}

}