package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Cidade;
import br.com.doae.ws.server.jpa.dao.CidadeDAO;

public class CidadoDAOImpl extends GenericDAOImpl<Cidade, Integer> implements CidadeDAO{

	public CidadoDAOImpl(EntityManager em) {
		super(em);
	}

}
