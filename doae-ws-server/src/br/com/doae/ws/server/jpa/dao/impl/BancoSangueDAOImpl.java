package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.BancoSangue;
import br.com.doae.ws.server.jpa.dao.BancoSangueDAO;

public class BancoSangueDAOImpl extends GenericDAOImpl<BancoSangue, Integer> implements BancoSangueDAO{

	public BancoSangueDAOImpl(EntityManager em) {
		super(em);
	}

}
