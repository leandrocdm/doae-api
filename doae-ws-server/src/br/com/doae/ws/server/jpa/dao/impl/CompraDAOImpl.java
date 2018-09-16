package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Compra;
import br.com.doae.ws.server.jpa.dao.CompraDAO;

public class CompraDAOImpl extends GenericDAOImpl<Compra, Integer>
implements CompraDAO{
	
	public CompraDAOImpl(EntityManager em) {
		super(em);
	}

}