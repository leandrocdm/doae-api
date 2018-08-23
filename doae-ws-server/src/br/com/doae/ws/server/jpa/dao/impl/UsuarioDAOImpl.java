package br.com.doae.ws.server.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.doae.ws.server.entity.Usuario;
import br.com.doae.ws.server.jpa.dao.UsuarioDAO;

public class UsuarioDAOImpl 
			extends GenericDAOImpl<Usuario, Integer>
					implements UsuarioDAO{

	public UsuarioDAOImpl(EntityManager em) {
		super(em);
	}

}