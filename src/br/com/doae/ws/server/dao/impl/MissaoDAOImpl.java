package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Missao;
import br.com.doae.ws.server.dao.MissaoDAO;

public class MissaoDAOImpl extends GenericDAOImpl<Missao, Integer>
implements MissaoDAO{
	
	public MissaoDAOImpl(EntityManager em) {
		super(em);
	}

}