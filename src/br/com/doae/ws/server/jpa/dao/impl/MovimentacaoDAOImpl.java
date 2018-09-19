package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Movimentacao;
import br.com.doae.ws.server.jpa.dao.MovimentacaoDAO;

public class MovimentacaoDAOImpl extends GenericDAOImpl<Movimentacao, Integer>
implements MovimentacaoDAO{
	
	public MovimentacaoDAOImpl(EntityManager em) {
		super(em);
	}

}