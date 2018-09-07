package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.TipoMissao;
import br.com.doae.ws.server.jpa.dao.TipoMissaoDAO;

public class TipoMissaoDAOImpl extends GenericDAOImpl<TipoMissao, Integer> implements TipoMissaoDAO{

	public TipoMissaoDAOImpl(EntityManager em) {
		super(em);
	}

}
