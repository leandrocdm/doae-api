package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Estado;
import br.com.doae.ws.server.jpa.dao.EstadoDAO;

public class EstadoDAOImpl extends GenericDAOImpl<Estado, Integer> implements EstadoDAO {

	public EstadoDAOImpl(EntityManager em) {
		super(em);
	}

}
