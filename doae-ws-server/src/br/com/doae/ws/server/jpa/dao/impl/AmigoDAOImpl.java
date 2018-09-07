package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Amigo;
import br.com.doae.ws.server.jpa.dao.AmigoDAO;

public class AmigoDAOImpl extends GenericDAOImpl<Amigo, Integer> implements AmigoDAO{

	public AmigoDAOImpl(EntityManager em) {
		super(em);
	}

}
