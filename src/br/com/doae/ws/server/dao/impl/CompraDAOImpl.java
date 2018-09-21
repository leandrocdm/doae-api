package br.com.doae.ws.server.dao.impl;

import br.com.doae.ws.server.entity.Compra;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.dao.CompraDAO;
import br.com.doae.ws.server.dao.impl.GenericDAOImpl;

public class CompraDAOImpl extends GenericDAOImpl<Compra, Integer> implements CompraDAO{

	public CompraDAOImpl(EntityManager em) {
		super(em);
	}
	
}