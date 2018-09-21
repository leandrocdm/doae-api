package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Movimentacao;
import br.com.doae.ws.server.dao.MovimentacaoDAO;

public class MovimentacaoDAOImpl extends GenericDAOImpl<Movimentacao, Integer>
implements MovimentacaoDAO{
	
	public MovimentacaoDAOImpl(EntityManager em) {
		super(em);
	}

}