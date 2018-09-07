package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.ExtratoUsuario;
import br.com.doae.ws.server.jpa.dao.ExtratoUsuarioDAO;

public class ExtratoUsuarioDAOImpl extends GenericDAOImpl<ExtratoUsuario, Integer> implements ExtratoUsuarioDAO{

	public ExtratoUsuarioDAOImpl(EntityManager em) {
		super(em);
	} 

}
