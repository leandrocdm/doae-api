package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Doacao;
import br.com.doae.ws.server.dao.DoacaoDAO;

public class DoacaoDAOImpl extends GenericDAOImpl<Doacao, Integer>
implements DoacaoDAO{
	
	public DoacaoDAOImpl(EntityManager em) {
		super(em);
	}

}