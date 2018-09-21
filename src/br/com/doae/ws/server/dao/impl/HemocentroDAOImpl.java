package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Hemocentro;
import br.com.doae.ws.server.dao.HemocentroDAO;

public class HemocentroDAOImpl extends GenericDAOImpl<Hemocentro, Integer>
implements HemocentroDAO{
	
	public HemocentroDAOImpl(EntityManager em) {
		super(em);
	}

}