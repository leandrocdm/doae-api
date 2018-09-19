package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Endereco;
import br.com.doae.ws.server.jpa.dao.EnderecoDAO;

public class EnderecoDAOImpl extends GenericDAOImpl<Endereco, Integer>
implements EnderecoDAO{
	
	public EnderecoDAOImpl(EntityManager em) {
		super(em);
	}

}