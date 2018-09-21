package br.com.doae.ws.server.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.dao.EnderecoDAO;

public class EnderecoDAOImpl extends GenericDAOImpl<Endereco, Integer>
implements EnderecoDAO{
	
	public EnderecoDAOImpl(EntityManager em) {
		super(em);
	}

}