package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.CentroDoacao;
import br.com.doae.ws.server.jpa.dao.CentroDoacaoDAO;

public class CentroDoacaoDAOImpl extends GenericDAOImpl<CentroDoacao, Integer> implements CentroDoacaoDAO{

	public CentroDoacaoDAOImpl(EntityManager em) {
		super(em);
	}

}
