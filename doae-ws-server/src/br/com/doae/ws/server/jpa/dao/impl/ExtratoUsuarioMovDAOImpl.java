package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.ExtratoUsuarioMov;
import br.com.doae.ws.server.jpa.dao.ExtratoUsuarioMovDAO;

public class ExtratoUsuarioMovDAOImpl extends GenericDAOImpl<ExtratoUsuarioMov, Integer> implements ExtratoUsuarioMovDAO{

	public ExtratoUsuarioMovDAOImpl(EntityManager em) {
		super(em);
	}

}
